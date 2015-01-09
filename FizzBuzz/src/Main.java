
/**
 * FizzBuzz CodeEval Challenege
 * By Jarrod Z. Thibodeau
 * September 3rd, 2014
 *
 * Challenge:Write a program that prints out the final series of numbers where those divisible by X, Y and both are
 * replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
 *
 */


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

                //Setting up the values based on input
	            int fizz = Integer.parseInt(lineArray[0]);
	            int buzz = Integer.parseInt(lineArray[1]);
	            int length = Integer.parseInt(lineArray[2]);


                //If statements checking on constraints
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

                /*
                    For the length of the loop
                    Check if any number if divisible
                    by the first or second argument
                 */
	            for(int i = 1; i <=length; i++){

                    //Printing out number
	            	if(i == 0){
	            		System.out.print(i + " ");
	            	}

                    //If both first & second
	            	else if(i % fizz == 0 && i % buzz == 0){
	            		System.out.print("FB" + " ");
	            	}

                    //If First
	            	else if(i % fizz == 0){
	            		System.out.print("F" + " ");
	            	}

                    //If second
	            	else if(i % buzz == 0){
	            		System.out.print("B" + " ");
	            	}

                    //Just print number
	            	else{
	            		System.out.print(i + " ");
	            	}
	            	
	            }

                //Line Spacing
	            System.out.println("");
	        }
	    }
		
	}

}
