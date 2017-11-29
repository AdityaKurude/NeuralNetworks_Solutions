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





5. NNSolutionFive :



required directory path : your_path/NeuralNetworks_Solutions/NNSolutionFive/src/nnsolutionfive


compile the Java file from command line using JavaCompiler.
e.g javac -cp ../../dist/NNSolutionFive.jar NNSolutionFive.java


run/execute the binary from command line using JRE.
e.g java -cp ../../dist/NNSolutionFive.jar nnsolutionfive.NNSolutionFive


The program asks for all the required parameters and accepts from command line as inputs. Explanation of different parameters and required format is explained as follows :

1. Teaching Parameters : expected three values separated with ",". First number represents number of epocs (int), second number is learning rate (double), thirst number is division factor for
train/test set (double). Total number of samples are calculated by reading the emailspam_dataset (csv file).

eg. 

Enter Teaching parameters of the ArtNeural Network: 
286,0.07,0.8

Meaning, 286 epocs, learning rate = 0.07, 80% samples to be used as training samples and remaining 20% will be used for verification. 

2. Architecture of the Network : expected integer values separated by ","

eg.

Enter architecture of the ArtNeural Network: 
57,40,20,1

This creates a network with input layer containing 57 neurons, first hidden layer with 40 neurons, second hidden layer with 20 neurons and final layer with 1 neuron.

3. Detection Threshold : Final result expected is binary i.e whether the email is spam/not spam. Detection threshold (double) is used as a comparison of final result. If the result > threshold then its binary value is considered as 1 whereas if result < threshold, its binary value is considered 0.

Enter the detection threshold: 
0.9

4. Folder Path containing spam_dataset : string value specifying the absolute path of the folder containing spam database (.csv file). Notice that it should be the complete path with ending "/"

eg.

/home/ubuntu-admin/SharedFolder/EIT_Studies/BME/Study/IntelligentDataAnalysis/Assignment/NeuralNetworks/Java/arch_8_comb/

It is important to end the folder path with "/", i.e arch_8_comb/ and not only arch_8_comb


Note : It is expected that you should have valid email spam dataset in this folder with name "spambase_train.csv"


Following is example showing all the valid inputs given to start the training process.


ubuntu-admin@Lenovo: java -cp ../../dist/NNSolutionFive.jar nnsolutionfive.NNSolutionFive 
Enter Teaching parameters of the ArtNeural Network: 
286,0.07,0.8
Enter architecture of the ArtNeural Network: 
57,40,20,1
Enter the detection threshold: 
0.9
Enter the folder where the spambase_train.csv file is stored : 
/home/ubuntu-admin/SharedFolder/EIT_Studies/BME/Study/IntelligentDataAnalysis/Assignment/NeuralNetworks/Java/arch_8_comb/
Enter the name for teh output file : 
verify_solution
 Created New Neural Net
 training epoc number : 0
 tr smpl : 3600 : valid smpls : 900 tr err : 508.5484326770312 valid err : 110.52423205448409 mispred : 148
 RMS batch Error = 508.5484326770312




