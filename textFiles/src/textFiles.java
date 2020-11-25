/* textFiles.java
CSCI 111-900
Last edited by Pat Doyle 11/12/19
 */

import java.util.Scanner;

public class textFiles {
    public static void main(String[] lines) throws Exception {

        java.io.File input = new java.io.File("testScores.txt");
        Scanner scnr = new Scanner(input);
        int i;
        double[] testScores = new double[5];

        //defines variables to read text files, index for for loop, and array testScores

        for(i = 0; i < testScores.length; i++) {
            testScores[i] = scnr.nextDouble();
            System.out.println("Score " + (i +1) + ": " + testScores[i]);
        }

        // for loop reads values from text file into array and prints them

        double sum = 0;

        for(i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }

        double avg = sum / testScores.length;

        //calculates the sum and average of the test scores

        i = 0;
        double max = testScores[i];
        double min = testScores[i];

        for(i = 1; i < testScores.length; i++) {

            if (testScores[i] > max)
                max = testScores[i];

            if (testScores[i] < min)
                min = testScores[i];

        }

        //defines variables for loop and finds highest and lowest test scores

        java.io.File testScoresInfo = new java.io.File("testScoresInfo.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(testScoresInfo);

        //defines variables to print text to a new file

        output.println("Average: " + avg);
        output.println("Highest Score: " + max);
        output.println("Lowest Score: " + min);
        output.close();

        //outputs value for given variables to text file, and closes





        }


    }

