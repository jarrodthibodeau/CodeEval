/**
 * Remove Duplicates CodeEval Challenge
 * By Jarrod Z. Thibodeau
 * January 9th, 2015
 *
 * Challenge: In a given text, if there are two or more identical characters in sequence,
 * delete the repetitions and leave only the first character.
 *
 * Constraints:
 * The text is case-sensitive: ‘a’ and ‘A’ are different characters.
 * The input consists of 40 text lines.
 * The maximum size of the text is 10 KB.

 *
 */
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            //Using regex to replace everything.
            System.out.println(line.replaceAll("(.)\\1{1,}", "$1"));

        }
    }
}
