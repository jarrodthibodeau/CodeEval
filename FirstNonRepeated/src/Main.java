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

        for(int i = 0; i < line.length(); i++)
        {
            boolean isRepeat = false;

            for(int j = 0; j < line.length(); j++)
            {
                if(i!=j && line.charAt(i) == line.charAt(j))
                {
                    isRepeat = true;
                    break;
                }
            }

            if(!isRepeat)
            {
                System.out.println(line.charAt(i));
                break;
            }
        }
    }
  }
}
