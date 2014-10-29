import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        int number = Integer.parseInt(line);
        int total = 0;
        while(number != 0){
            total += Math.pow(number % 10, line.length());
            number /= 10;
        }

        if(total == Integer.parseInt(line)){
            System.out.println("True");
        }

        else{
            System.out.println("False");
        }

    }
  }
}
