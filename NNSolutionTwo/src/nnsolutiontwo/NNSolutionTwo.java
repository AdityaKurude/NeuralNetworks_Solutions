/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnsolutiontwo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ubuntu-admin
 */
public class NNSolutionTwo {

    public static final boolean debugMode = false;
    public static final boolean isWeightInput = true;

    /* or false :-) */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Enter architecture of the ArtNeural Network: ");
        Scanner scanner = new Scanner(System.in);
        String str_architecture = scanner.nextLine();

        if (debugMode) {
            System.out.println("Your architecture is " + str_architecture);
        }

        String[] array = str_architecture.split(",", -1);
        ArrayList<Integer> architecture = new ArrayList<Integer>();

        for (int num_layers = 0; num_layers < array.length; num_layers++) {

            int num_neurons = Integer.parseInt(array[num_layers]);
            architecture.add(num_neurons);
        }

        ArtNeuralNet myNet = new ArtNeuralNet(architecture);

        //accept Input sample values from user
        System.out.println("Enter number of samples : ");
        String str_number_samples = scanner.nextLine();
        System.out.println(" Number of inputs " + str_number_samples);

        int num_samples = Integer.parseInt(str_number_samples);

        ArrayList<Double> inputVal = new ArrayList<Double>();

        for (int n_sample = 0; n_sample < num_samples; n_sample++) {
            System.out.println("Enter input values for sample " + n_sample);
            inputVal.clear();

            String str_inputVal = scanner.nextLine();

            String[] arr_inputVal = str_inputVal.split(",", -1);

            for (int num_val = 0; num_val < arr_inputVal.length; num_val++) {

                Double input_val = Double.parseDouble(arr_inputVal[num_val]);
                inputVal.add(input_val);
            }

            myNet.forwardPass(inputVal);
            
            ArrayList<Double> outputVal = new ArrayList<Double>();

            myNet.getResult(outputVal);
            myNet.showVector(outputVal);
        }
    }

}
