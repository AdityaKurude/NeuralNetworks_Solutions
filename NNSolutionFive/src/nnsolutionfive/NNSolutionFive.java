/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnsolutionfive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ubuntu-admin
 */
public class NNSolutionFive {

    public static final boolean debugMode = false;
    public static final boolean isWeightInput = false;
    public static double eta = 0.0;
    public static double detection_threshold = 0.9;

    public static Double alpha = 0.15;

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "epoc,error_test,error_validate,total_mispredictions";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Enter Teaching parameters of the ArtNeural Network: ");
        Scanner scanner = new Scanner(System.in);
        String str_teachingParam = scanner.nextLine();
        String[] teaching_array = str_teachingParam.split(",", -1);
        int epocs = Integer.parseInt(teaching_array[0]);

        //assign learning rate
        eta = Double.parseDouble(teaching_array[1]);
        Double sample_div_factor = Double.parseDouble(teaching_array[2]);

        System.out.println("Enter architecture of the ArtNeural Network: ");
        String str_architecture = scanner.nextLine();
        String str_architecture_disp = new String(str_architecture);
        

        if (debugMode) {
            System.out.println("Your architecture is " + str_architecture);
        }

        String[] array = str_architecture.split(",", -1);
        ArrayList<Integer> architecture = new ArrayList<Integer>();

        for (int num_layers = 0; num_layers < array.length; num_layers++) {

            int num_neurons = Integer.parseInt(array[num_layers]);
            architecture.add(num_neurons);
        }

        System.out.println("Enter the detection threshold: ");
        String str_threshold = scanner.nextLine();
        detection_threshold = Double.parseDouble(str_threshold);

        System.out.println("Enter the folder where the spambase_train.csv file is stored : ");
        String str_base_path = scanner.nextLine();
        
        System.out.println("Enter the name for teh output file : ");
        String result_file = scanner.nextLine();
        
//        String str_base_path = args[0];

        BufferedReader br_config = null;
//        String line_config = args[2];
//        String result_file = args[1];
//        int epocs = 0;
//        Double sample_div_factor = 0.0;
//        ArrayList<Integer> architecture = new ArrayList<Integer>();

//        String[] array_config = line_config.split(",", -1);
//        epocs = Integer.parseInt(array_config[0]);
//        eta = Double.parseDouble(array_config[1]);
//        sample_div_factor = Double.parseDouble(array_config[2]);

//        architecture.add(Integer.parseInt(array_config[3]));
//        architecture.add(Integer.parseInt(array_config[4]));
//        architecture.add(Integer.parseInt(array_config[5]));
//        architecture.add(Integer.parseInt(array_config[6]));

//        System.out.println(" epocs = " + epocs + " : eta = " + eta + " : sample div factor = " + sample_div_factor
//                + " : Architecture " + array_config[3] + ", " + array_config[4] + ", " + array_config[5] + ", " + array_config[6]);

//        detection_threshold = Double.parseDouble(array_config[7]);

        ArtNeuralNet myNet = new ArtNeuralNet(architecture);

//        int testSamples = (int) (totalSamples * ArtNeuralNet.m_fraction_test_samples);
//        int verifySamples = (totalSamples - testSamples);
        ArrayList<ArrayList<Double>> arr_inputVal = new ArrayList<ArrayList<Double>>();
        ArrayList<ArrayList<Double>> arr_targetVal = new ArrayList<ArrayList<Double>>();

        int total_features = architecture.get(0);

//        System.out.println("Enter absolute path of dataset : ");
//        String str_path = scanner.nextLine();
//        int totalSamples = Integer.parseInt(str_number_samples);
        String csvFile = str_base_path + "spambase_train.csv";
        BufferedReader br = null;
        String line = "";
        int sample_num = 0;

        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                sample_num++;
                ArrayList<Double> inputVal = new ArrayList<Double>();
                ArrayList<Double> targetVal = new ArrayList<Double>();
//        ArrayList<Double> resultVal = new ArrayList<Double>();

                String[] array_features = line.split(",", -1);

                for (int feature = 0; feature < total_features; feature++) {
//                    System.out.println(" feature " + feature + " is " + sample[feature]);
                    inputVal.add(Double.parseDouble(array_features[feature]));
                }
                targetVal.add(Double.parseDouble(array_features[total_features]));

                arr_inputVal.add(inputVal);
                arr_targetVal.add(targetVal);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * *********************************write to CSV file
         * *********************************************
         */
        FileWriter fileWriter = null;
        try {

            String filename = str_base_path + result_file + ".csv";

            fileWriter = new FileWriter(filename);

            String hyperParam = " epocs = " + Integer.toString(epocs) + " : eta = " + Double.toString(eta) + " : sample div factor = " + Double.toString( sample_div_factor)
                    + " : Architecture " + str_architecture_disp;

            fileWriter.append(hyperParam);
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER);
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            int totalSamples = sample_num;
            int trainingSamples = (int) (totalSamples * sample_div_factor);
            int validationSamples = (totalSamples - trainingSamples);

            for (int epoc = 0; epoc < epocs; epoc++) {

                //Write a epoc to the CSV file
                fileWriter.append(Integer.toString(epoc));
                fileWriter.append(COMMA_DELIMITER);

                System.out.println(" training epoc number : " + epoc);
                myNet.m_batch_error = 0.0;

                for (int n_trSample = 0; n_trSample < trainingSamples; n_trSample++) {
                    myNet.trainNetwork(arr_inputVal.get(n_trSample), arr_targetVal.get(n_trSample));
                }

                //test RMS error
                fileWriter.append(Double.toString(myNet.m_batch_error));
                fileWriter.append(COMMA_DELIMITER);

                //reset error count before you start the verification process
                myNet.misPredictCount = 0;
                myNet.m_batch_valid_error = 0.0;

                for (int n_trSample = trainingSamples; n_trSample < totalSamples; n_trSample++) {
                    myNet.verifyNetwork(arr_inputVal.get(n_trSample), arr_targetVal.get(n_trSample));
                }

                //validation RMS error
                fileWriter.append(Double.toString(myNet.m_batch_valid_error));
                fileWriter.append(COMMA_DELIMITER);

                //total mispredictions
                fileWriter.append(Double.toString(myNet.misPredictCount));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(NEW_LINE_SEPARATOR);

                System.out.println(" tr smpl : " + trainingSamples + " : valid smpls : " + validationSamples
                        + " tr err : " + myNet.m_batch_error + " valid err : " + myNet.m_batch_valid_error + " mispred : " + myNet.misPredictCount);

                myNet.printRequiredResults();

            }

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }

    }
}
