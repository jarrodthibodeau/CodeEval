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
	        int count = 1;
	        if (lineArray.length > 0) {
	        	
	            int fizz = Integer.parseInt(lineArray[0]);
	            int buzz = Integer.parseInt(lineArray[1]);
	            int length = Integer.parseInt(lineArray[2]);
	            
	            if(fizz < 1 || fizz > 20){
	            	System.out.println("Fail.");
	            	break;
	            }
	            
	            if(buzz < 1 || buzz > 20){
	            	System.out.println("Fail.");
	            	break;
	            }
	            
	            if(length < 21 || length > 100) {
	            	System.out.println("Fail.");
	            	break;
	            }
	            
	            for(int i = 1; i <=length; i++){
	            	
	            	if(i == 0){
	            		System.out.print(i + " ");
	            	}
	            	
	            	else if(i % fizz == 0 && i % buzz == 0){
	            		System.out.print("FB" + " ");
	            	}
	            	
	            	else if(i % fizz == 0){
	            		System.out.print("F" + " ");
	            	}
	            	
	            	else if(i % buzz == 0){
	            		System.out.print("B" + " ");
	            	}
	            	
	            	else{
	            		System.out.print(i + " ");
	            	}
	            	
	            }
	            
	            System.out.println("");
	        }
	    }
		
	}

}
