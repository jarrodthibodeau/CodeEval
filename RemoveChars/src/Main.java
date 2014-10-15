import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split(",");
			if (lineArray.length > 0) {

				char[] firstWordChars = lineArray[0].toCharArray();

				ArrayList<Character> originalWord = new ArrayList<Character>();

				for (int i = 0; i < firstWordChars.length; i++) {

					originalWord.add(firstWordChars[i]);
				}

				char[] selectedChars = lineArray[1].toCharArray();

				for (int i = 1; i < selectedChars.length; i++) {

					for (int j = 0; j < originalWord.size(); j++) {

						if (originalWord.get(0) == ' ') {
							originalWord.remove(0);
						}

						if (originalWord.get(j) == selectedChars[i]) {
							originalWord.remove(j);
						}
					}
				}

				StringBuilder sb = new StringBuilder(originalWord.size());

				for (int i = 0; i < originalWord.size(); i++) {
					sb.append(originalWord.get(i));
				}

				sb.trimToSize();

				System.out.println(sb);

			}

		}

		in.close();
	}

}
