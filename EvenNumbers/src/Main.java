import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {

			int count = Integer.parseInt(line);
			
			if(count % 2 == 0){
				System.out.println(1);
			}
			
			else{
				System.out.println(0);
			}
		}

		in.close();
	}
}
