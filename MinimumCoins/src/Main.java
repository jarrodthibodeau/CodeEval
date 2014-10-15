import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {	
			int amount = Integer.parseInt(line);
			
			if (amount < 3) {
				System.out.println(amount);
			}

			else if (amount == 4) {
				System.out.println(4);
			}

			else {

				int fiveAmount = amount / 5;
				amount = amount - (fiveAmount * 5);

				int threeAmount = amount / 3;
				amount = amount - (threeAmount * 3);
								
				int total = fiveAmount + threeAmount + amount;

				System.out.println(total);
			}								
		}
		
		in.close();
				
	}
}
