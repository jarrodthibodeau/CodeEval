import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Trailing String CodeEval Challenge
 * By Jarrod Z. Thibodeau
 * October 22nd, 2014
 *
 * Challenge: You are given two strings 'A' and 'B'. Print out a 1 if string 'B' occurs at the end of string 'A'.
 * Else a zero.
 */
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(","); //Splits by the comma
            String[] words = lineArray[0].split("\\s"); //Takes the first element and splits by space
            if (lineArray.length > 0) {

                //If the final word in second array contains
                //word after comma, print 1
                if(words[words.length-1].contains(lineArray[1])){
                    System.out.println(1);
                }

                //Else print 0
                else{
                    System.out.println(0);
                }


            }
        }
    }

}
