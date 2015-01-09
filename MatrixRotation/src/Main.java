/**
 * Matrix Rotation CodeEval Challenge
 * By Jarrod Z. Thibodeau
 * January 9th, 2015
 *
 * Challenge: You are given a 2D N×N matrix.
 * Each element of the matrix is a letter: from ‘a’ to ‘z’.
 * Your task is to rotate the matrix 90° clockwise:
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            //Splitting elements by space
            String[] elements = line.split(" ");

            //Getting the value that would be N
            double sqrt = Math.sqrt((double) elements.length);
            int n = (int) sqrt;

            //Creating the matrix
            String[][] matrix = new String[n][n];

            int count = 0; //Counter for putting elements in place

            //This loop will add the elements into the 2D array
            while (count < elements.length) {
                //Loop for columns
                for (int i = 0; i < n; i++) {
                    //Loop for rows
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = elements[count];
                        count++;
                    }

                }

            }

            System.out.println(rotate(matrix, n));
        }
    }

    static public String rotate(String[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first; //setting the offset

                String top = matrix[first][i]; //Saving the top value

                //Sending left to the top
                matrix[first][i] = matrix[last - offset][first];

                //Sending bottom to the left
                matrix[last - offset][first] = matrix[last][last - offset];

                //Sending right to the bottom
                matrix[last][last - offset] = matrix[i][last];

                //Sending top to the right
                matrix[i][last] = top; //Top has been saved

            }
        }


        StringBuilder sb = new StringBuilder(); // new string builder

        //Building the string for necessary result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(matrix[i][j] + " ");
            }
        }

        return sb.toString();

    }
}