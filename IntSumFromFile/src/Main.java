import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		int total = 0;
		while ((line = in.readLine()) != null) {
			
			total = total + Integer.parseInt(line);
		}
		
		System.out.print(total);
		in.close();
	}
}
