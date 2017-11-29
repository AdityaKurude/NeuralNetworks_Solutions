/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnsolutiontwo;

import java.util.ArrayList;
import java.util.Scanner;
import static nnsolutiontwo.NNSolutionTwo.debugMode;

/**
 *
 * @author ubuntu-admin
 */
public class ArtNeuralNet {

    public ArtNeuralNet(ArrayList<Integer> arch) {

        if (NNSolutionTwo.debugMode) {
            System.out.println(" Created New Neural Net");
        }

        int num_layers = arch.size();

        for (int l_num = 0; l_num < num_layers; l_num++) {
            // create a new nerons layer
            ArrayList<ArtNeuron> newLayer = new ArrayList<ArtNeuron>();

            //if op layer then there are no further connections.
            int numOp = (l_num == arch.size() - 1) ? 0 : arch.get(l_num + 1);

            int num_neuron = 0;
            boolean isBiasNeuron = false;
            //create all neurons including bias
            for (num_neuron = 0; num_neuron <= arch.get(l_num); num_neuron++) {
                //last neuron created is bias neuron
                isBiasNeuron = num_neuron == arch.get(l_num);
                ArtNeuron newArtNeuron = new ArtNeuron(numOp, num_neuron, isBiasNeuron);
                newLayer.add(newArtNeuron);
//                System.out.println("");
            }

            //force bias neuron output to 1
            newLayer.get(num_neuron - 1).setOutVal(1.0);
            m_layers.add(newLayer);

        }

        // Print the numbers of neurons in each layer as a required output for the assignment
        int l_num = 0;
        for (l_num = 0; l_num < num_layers - 1; l_num++) {
            System.out.print(arch.get(l_num) + ",");
        }
        System.out.print(arch.get(l_num));
        System.out.println("");

        if (NNSolutionTwo.isWeightInput) {
            //Accept weights for individual neurons in the specific layers
            for (l_num = 1; l_num < num_layers; l_num++) {
                ArrayList<ArtNeuron> prevLayer = m_layers.get(l_num - 1);
                int num_neuron = 0;
                int pre_neuron = 0;

                for (num_neuron = 0; num_neuron < arch.get(l_num); num_neuron++) {

                    System.out.println("Enter weights of layer " + l_num + " Neuron no " + num_neuron);
                    Scanner scanner = new Scanner(System.in);
                    String str_weights = scanner.nextLine();

                    String[] weight_array = str_weights.split(",", -1);

                    if (debugMode) {
                        System.out.println("Your weights for layer are " + str_weights);
                    }
                    for (pre_neuron = 0; pre_neuron <= prevLayer.size() - 2; pre_neuron++) {
                        //                    System.out.print(prevLayer.get(pre_neuron).getWeights().get(num_neuron).weight + ",");
                        Double weight_val = Double.parseDouble(weight_array[pre_neuron]);
                        prevLayer.get(pre_neuron).getWeights().get(num_neuron).weight = weight_val;
                    }
                }
            }

            // Print the weight values to verify all neuron weights are initialized as specified by the user
            if (NNSolutionTwo.debugMode) {

                for (l_num = 1; l_num < num_layers; l_num++) {
                    ArrayList<ArtNeuron> prevLayer = m_layers.get(l_num - 1);
                    int num_neuron = 0;
                    int pre_neuron = 0;

                    for (num_neuron = 0; num_neuron < arch.get(l_num); num_neuron++) {

                        for (pre_neuron = 0; pre_neuron <= prevLayer.size() - 2; pre_neuron++) {
                            System.out.print(prevLayer.get(pre_neuron).getWeights().get(num_neuron).weight + ",");
                        }
                        System.out.print(prevLayer.get(pre_neuron).getWeights().get(num_neuron).weight);

                        System.out.println("");
                    }
                }

            }

        }
    }

    public void forwardPass(ArrayList<Double> inputVal) {
        // validate number of inputs == number of neurons in input layer

        //load inputs
        for (int i = 0; i < inputVal.size(); i++) {
            m_layers.get(0).get(i).setOutVal(inputVal.get(i));
        }
        //forward feed
        for (int layer_num = 1; layer_num < m_layers.size(); layer_num++) {
            ArrayList<ArtNeuron> prevLayer = m_layers.get(layer_num - 1);
            ArrayList<ArtNeuron> currentLayer = m_layers.get(layer_num);

            boolean isFinalLayer = ((m_layers.size() - 1) == layer_num);
            // access all but bias neurons
            for (int n = 0; n < m_layers.get(layer_num).size() - 1; n++) {
                currentLayer.get(n).feedForward(prevLayer, isFinalLayer);
            }
        }

    }

    public void getResult(ArrayList<Double> result) {
        result.clear();
        int numLayers = m_layers.size() - 1;
        for (int n = 0; n < m_layers.get(numLayers).size() - 1; n++) {
            result.add(m_layers.get(numLayers).get(n).getOutVal());
        }
    }

    public static void showVector(ArrayList<Double> inputVal) {
        for (int i = 0; i < inputVal.size(); i++) {
            System.out.print("," + inputVal.get(i));

        }
        System.out.println("");
    }

    private ArrayList<ArrayList<ArtNeuron>> m_layers = new ArrayList<ArrayList<ArtNeuron>>();
}
