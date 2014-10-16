import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jarrod on 9/17/14.
 */
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(" ");
            if (lineArray.length > 0) {

                int divide = lineArray.length / 2;
                int j = divide + 1;

                ArrayList<Integer> multiply = new ArrayList<Integer>();

                for(int i = 0; i < divide; i++){
                    multiply.add(Integer.parseInt(lineArray[i]) * Integer.parseInt(lineArray[j]));
                    j++;
                }

                for(int i : multiply){
                    System.out.print(i + " ");
                }

            }
            System.out.println(" ");
        }
    }
}