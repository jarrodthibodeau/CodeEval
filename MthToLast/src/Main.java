import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Mth to Last Element
 * By Jarrod Z. Thibodeau
 * September 17th, 2014
 *
 * Purpose of this application is to take in an argument that is a list of numbers
 * and a position, the goal is to print out the necessary letter based on the position
 * that is given
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(" "); //Splitting everything up by spaces
            if (lineArray.length > 0) {

                int charPosition = Integer.parseInt(lineArray[lineArray.length - 1]);

                if (charPosition <= lineArray.length - 1) {
                    //Printing out the correct position
                    System.out.println(lineArray[lineArray.length - charPosition - 1]);
                }

            }
        }
    }
}
