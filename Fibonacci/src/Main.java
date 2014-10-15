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
			
			int count = Integer.parseInt(line);
			int num = 1;
			for(int i = 0; i <= count; i++){
				num = fibonacci(i);
				
				if(i == count ){
					System.out.println(num);
				}
			}

		}
		
		in.close();
	}
	
	
	private static int fibonacci(int n){
		if(n <= 0){
			return n;
		}
		
		else if( n == 1){
			return 1;
		}
		
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
}
