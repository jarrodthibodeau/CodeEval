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
	    	int count = 0;
	        String[] lineArray = line.split("/s");
	        if (lineArray.length > 0) {
	            
	        	int age = Integer.parseInt(lineArray[count]);
	    		
	    		if(age >= 0 && age <= 2){
	    			System.out.println("Still in Mama's arms");
	    		}
	    		
	    		else if(age >= 3 && age <= 4){
	    			System.out.println("Preschool Maniac");
	    		}
	    		
	    		else if(age >= 5 && age <= 11){
	    			System.out.println("Elementary school");
	    		}
	    		
	    		else if(age >= 12 && age <= 14){
	    			System.out.println("Middle school");
	    		}
	    		
	    		else if(age >= 15 && age <= 18){
	    			System.out.println("High school");
	    		}
	    		
	    		else if(age >= 19 && age <= 22){
	    			System.out.println("College");
	    		}
	    		
	    		else if(age >= 23 && age <= 65){
	    			System.out.println("Working for the man");
	    		}
	    		
	    		else if(age >= 65 && age <= 100){
	    			System.out.println("The Golden Years");
	    		}
	    		
	    		else{
	    			System.out.println("This program is for humans");
	    		}
	    		
	    		count++;
	        	
	        }
	    }		
	}
}
