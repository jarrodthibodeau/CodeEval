import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		
		System.out.println(file.length());
		
		//in.close();

	}

}
