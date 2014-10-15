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
		while ((line = in.readLine()) != null) {

			char[] characters = line.toCharArray();
			int charCount = 0;

			for (int j = 0; j < characters.length; j++) {

				if (!Character.isAlphabetic(line.charAt(j))) {
					characters[j] = line.charAt(j);
				}

				else if (charCount % 2 == 0) {
					characters[j] = Character.toUpperCase(line.charAt(j));
					charCount++;
				}

				else {
					characters[j] = Character.toLowerCase(line.charAt(j));
					charCount++;
				}
			}

			for (int z = 0; z < characters.length; z++) {
				System.out.print(characters[z]);
			}
			
			System.out.println("");

		}		
	}
}
