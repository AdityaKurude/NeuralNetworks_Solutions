# NeuralNetworks_Solutions
This Repository contains Solution for the Neural Network assignment. Detailed testing steps for ifferent part of the solution are described as follows.

1. NNSolutionOne

required directory path : your_path/NeuralNetworks_Solutions/NNSolutionOne/src/nnsolutionone

compile the Java file from command line using JavaCompiler.
eg. javac -cp ../../dist/NNSolutionOne.jar NNSolutionOne.java

run/execute the binary from command line using JRE.
eg. java -cp ../../dist/NNSolutionOne.jar nnsolutionone.NNSolutionOne

For the part one of the solution :
The inputs are received in the following order: architecture
The program should give the output in the following order: architecture , weights


eg. 

java -cp ../../dist/NNSolutionOne.jar nnsolutionone.NNSolutionOne 
Enter architecture of the ArtNeural Network: 
2,3,1
2,3,1
0.16506813981170468,0.04856717271479045,0.0
0.005865662807470209,0.05266062771141,0.0
-0.1882043040923505,0.1519108681010289,0.0
-0.06075504676594465,0.02266746377397619,-0.2593139010168084,0.0


2. NNSolutionTwo

required directory path : your_path/NeuralNetworks_Solutions/NNSolutionTwo/src/nnsolutiontwo

compile the Java file from command line using JavaCompiler.
e.g javac -cp ../../dist/NNSolutionTwo.jar NNSolutionTwo.java


run/execute the binary from command line using JRE.
e.g java -cp ../../dist/NNSolutionTwo.jar nnsolutiontwo.NNSolutionTwo

For the part two of the solution :
The inputs are given in the following order: architecture , weights , inputs
The program should give the output in the following order: output values

eg.

java -cp ../../dist/NNSolutionTwo.jar nnsolutiontwo.NNSolutionTwo 
Enter architecture of the ArtNeural Network: 
2,3,1
2,3,1
Enter weights of layer 1 Neuron no 0
1.1,1.2
Enter weights of layer 1 Neuron no 1
2.1,2.2
Enter weights of layer 1 Neuron no 2
3.1,3.2
Enter weights of layer 2 Neuron no 0
4.1,4.2,4.3
Enter number of samples : 
4
 Number of inputs 4
Enter input values for sample 0
1,1
,54.580000000000005
Enter input values for sample 1
2,2
,109.16000000000001
Enter input values for sample 2
3,3
,163.74
Enter input values for sample 3
4,4
,218.32000000000002



