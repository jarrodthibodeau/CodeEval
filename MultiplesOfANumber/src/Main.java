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
			String[] lineArray = line.split(",");
			if (lineArray.length > 0) {
								
				int firstNum = Integer.parseInt(lineArray[0]);
				int secondNum = Integer.parseInt(lineArray[1]);
				
				while(firstNum >= secondNum){
					
					secondNum = secondNum*2;
				}
				
				System.out.println(secondNum);
			}
		}
		
		in.close();
	}

}
