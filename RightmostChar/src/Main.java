import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			boolean letterFound = false;
			String[] lineArray = line.split(",");
			int count = lineArray[0].length() - 1;
			if (lineArray.length > 0) {												
				for (int i = lineArray[0].length() -1; i > 0; i--) {
											
					
					if(lineArray[0].charAt(i) == lineArray[1].charAt(0)){
						System.out.println(count);
						letterFound = true;
						break;
					}
					
					else if(Character.isAlphabetic(lineArray[0].charAt(i))){
						count--;
					}
																		
				}
				
				if(!letterFound){
					System.out.println(-1);
				}
			}

		}
		in.close();
	}
}
