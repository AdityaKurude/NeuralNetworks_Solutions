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


3. NNSolutionThree

required directory path : your_path/NeuralNetworks_Solutions/NNSolutionThree/src/nnsolutionthree


compile the Java file from command line using JavaCompiler.
e.g javac -cp ../../dist/NNSolutionThree.jar NNSolutionThree.java


run/execute the binary from command line using JRE.
e.g java -cp ../../dist/NNSolutionThree.jar nnsolutionthree.NNSolutionThree


Expected inputs and outputsfor part three are :

The inputs are given in the following order: architecture (M = 1) , weights , inputs (S = 1)
The program should give the output in the following order: architecture , weights, partial derivatives

eg.

java -cp ../../dist/NNSolutionThree.jar nnsolutionthree.NNSolutionThree 
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
2
 Number of inputs 2
Enter input values for sample 0
1,1
-0.4780899999999997,1.2,-1.5780899999999998
0.48341999999999996,2.2,-1.6165800000000001
1.4449300000000003,3.2,-1.6550699999999998
-25.66,0.0
-105.20599999999999,-107.772,-110.338,0.0
Enter input values for sample 1
2,2
-0.4780899999999997,1.2,-1.5780899999999998
0.48341999999999996,2.2,-1.6165800000000001
1.3096572010262646,3.2,-1.7227063994868677
-1.4513579199000022,0.0
-0.0,-0.0,-4.509093299124525,0.0






4. NNSolutionFour 


required directory path : your_path/NeuralNetworks_Solutions/NNSolutionFour/src/nnsolutionfour


compile the Java file from command line using JavaCompiler.
e.g javac -cp ../../dist/NNSolutionFour.jar NNSolutionFour.java


run/execute the binary from command line using JRE.
e.g java -cp ../../dist/NNSolutionFour.jar nnsolutionfour.NNSolutionFour

Expected inputs and outputs for part four are :

The program receives the inputs in the following order: teaching parameters , architecture , weights , input samples
The program should be output to the output in the following order: average square errors , architecture , weights

eg. 


java -cp ../../dist/NNSolutionFour.jar nnsolutionfour.NNSolutionFour
Enter Teaching parameters of the ArtNeural Network: 
2,0.015,0.5
Enter architecture of the ArtNeural Network: 
2,3,1
 Created New Neural Net
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
 Number of samples 4
Enter values of sample number : 0
1,1,0
Enter values of sample number : 1
0,0,1
Enter values of sample number : 2
1,0,1
Enter values of sample number : 3
0,1,1
 total samples = 4 total targetVal = 4
 training epoc number : 0
 RMS Error = 1.0
2,3,1,
-2.2566699999999997,-2.15667,-3.35667
-1.33854,-1.23854,-3.43854
-0.42040999999999995,-0.32040999999999986,-3.52041
 training epoc number : 1
 RMS Error = 1.0
2,3,1,
-2.2566699999999997,-2.15667,-3.35667
-1.33854,-1.23854,-3.43854
-0.42040999999999995,-0.32040999999999986,-3.52041
 Total errors in prediction = 2






