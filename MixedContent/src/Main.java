import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split(",");
        if (lineArray.length > 0) {

            ArrayList<String> numbers = new ArrayList<String>();
            ArrayList<String> words = new ArrayList<String>();

            for(int i = 0; i < lineArray.length; i++){

                if(Character.isAlphabetic(lineArray[i].charAt(0)))
                {
                    words.add(lineArray[i]);
                }

                else
                {
                    numbers.add(lineArray[i]);
                }
            }

            for(int j = 0; j < words.size(); j++)
            {
                if(j == words.size() - 1)
                {
                    System.out.print(words.get(j));
                }

                else
                {
                    System.out.print(words.get(j) + ',');
                }
            }

            if(numbers.size() > 0 && words.size() > 0)
            {
                System.out.print('|');
            }

            for(int k = 0; k < numbers.size(); k++)
            {
                if(k == numbers.size() - 1)
                {
                    System.out.print(numbers.get(k));
                }
                else
                {
                    System.out.print(numbers.get(k) + ',');
                }
            }

        }

        System.out.println("");
    }
  }
}
