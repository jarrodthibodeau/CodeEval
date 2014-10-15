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
			String[] lineArray = line.split(" ");
			if (lineArray.length > 0) {
				
				for(int i = 0; i < lineArray.length; i++){
					
					lineArray[i] = Character.toUpperCase(lineArray[i].charAt(0))  + lineArray[i].substring(1);
					System.out.print(lineArray[i] + " ");
				}
				
				System.out.println("");
			}
			
		}

		in.close();
	}

}
