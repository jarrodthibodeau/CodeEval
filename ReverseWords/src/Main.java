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
			String[] lineArray = line.split("\\s+");
			
			if (lineArray.length > 0) {
				String[] reverse = new String[lineArray.length];
				
				int count = 0;
				
				for(int i = lineArray.length - 1; i >= 0; i--){
					
					reverse[count] = lineArray[i];
					count++;
				}
				
				for(int i = 0; i < reverse.length; i++){
					System.out.print(reverse[i] + " ");
				}
			}
			
			System.out.println(" ");
		}
		
		in.close();
	}
	
}
