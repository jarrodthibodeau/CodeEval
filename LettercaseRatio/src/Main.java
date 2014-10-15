import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			
			double upperCount = 0;
			double lowerCount = 0;
			double lineCount = 0;
			
			for(int i = 0; i < line.length(); i++){
				
				if(Character.isAlphabetic(line.charAt(i))){
					lineCount++;
				}
				
				if(Character.isUpperCase(line.charAt(i))){
					upperCount++;;
				}
				
				else if(Character.isLowerCase(line.charAt(i))){
					lowerCount++;
				}
			}
			
			
			double upperPercentage = (upperCount / lineCount) * 100;
			double lowerPercentage = (lowerCount / lineCount) * 100;
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.println("lowercase: " + df.format(lowerPercentage) + " uppercase: " + df.format(upperPercentage));
			
			
		}
	}
}
