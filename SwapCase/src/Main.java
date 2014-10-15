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
			// String[] lineArray = line.split(" ");
			// if (lineArray.length > 0) {

			char[] newWord = new char[line.length()];
			
			for(int i = 0; i < newWord.length; i++){
				
				if(!Character.isAlphabetic(line.charAt(i))){
					newWord[i] = line.charAt(i);
				}
				
				else if(Character.isUpperCase(line.charAt(i))){
					newWord[i] = Character.toLowerCase(line.charAt(i));
				}
				
				else{
					newWord[i] = Character.toUpperCase(line.charAt(i));
				}
			}
			
			
			for(int i = 0; i < newWord.length; i++){
				System.out.print(newWord[i]);
			}
			
			System.out.println("");

		}
	}
}
