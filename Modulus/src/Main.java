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
			String[] lineArray = line.split(",");
			if (lineArray.length > 0) {

				int n = Integer.parseInt(lineArray[0]);
				int m = Integer.parseInt(lineArray[1]);

				int divide = n / m;

				int mod = n - (m * divide);

				System.out.println(mod);

			}

		}

		in.close();
	}
}
