/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnsolutiontwo;

import java.util.ArrayList;

/**
 *
 * @author ubuntu-admin
 */
public class ArtNeuron {

    public ArtNeuron(int numOp, int myIndex, boolean isBiasNeuron) {

        if (NNSolutionTwo.debugMode) {
            System.out.println(" created ArtNeuron ");
        }

        // Initialize all connections with random values
        for (int num_connect = 0; num_connect < numOp; num_connect++) {
            NeuronConnect newNeuronConnect = new NeuronConnect(isBiasNeuron);
            m_weights.add(newNeuronConnect);
        }
        my_Index = myIndex;

    }

    public void feedForward(ArrayList<ArtNeuron> prevLayer, boolean isFinalLayer) {
        double sum = 0.0;

        // Including the boas neuron in the previous layer
        for (int n = 0; n < prevLayer.size(); n++) {
            double val = prevLayer.get(n).getOutVal();
            sum += (val * prevLayer.get(n).m_weights.get(my_Index).weight);
        }
        // If it is final layer then apply unit linearity otherwise for all other layers apply activation function
        m_outVal = activationFun(sum);
    }

    static double activationFun(double input) {
        return Math.max(0.0, input);
    }

    public void setOutVal(double outVal) {
        m_outVal = outVal;
    }

    public double getOutVal() {
        return m_outVal;
    }

    public ArrayList<NeuronConnect> getWeights() {
        return m_weights;
    }

    private double m_outVal = new Double(0);
    private int my_Index;

    private ArrayList<NeuronConnect> m_weights = new ArrayList<NeuronConnect>();
}
