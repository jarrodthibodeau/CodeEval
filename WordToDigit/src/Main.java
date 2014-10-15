import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split(";");
			if (lineArray.length > 0) {

				for (int i = 0; i < lineArray.length; i++) {
					
					if (lineArray[i].equals("zero")) {
						System.out.print(0);
					}

					else if (lineArray[i].equals("one")) {
						System.out.print(1);
					}

					else if (lineArray[i].equals("two")) {
						System.out.print(2);
					}

					else if (lineArray[i].equals("three")) {
						System.out.print(3);
					}

					else if (lineArray[i] .equals("four")) {
						System.out.print(4);
					}

					else if (lineArray[i].equals("five")) {
						System.out.print(5);
					}

					else if (lineArray[i].equals("six")) {
						System.out.print(6);
					}

					else if (lineArray[i].equals("seven")) {
						System.out.print(7);
					}

					else if (lineArray[i].equals("eight")) {
						System.out.print(8);
					}

					else if (lineArray[i].equals("nine")) {
						System.out.print(9);
					}
				}

				System.out.println("");

			}

		}

		in.close();
	}
}
