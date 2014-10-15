import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split(" ");
			if (lineArray.length > 0) {

				Stack<Integer> firstStack = new Stack<Integer>();
								
				for(int i = 1; i < lineArray.length + 1; i++){					
					firstStack.push(Integer.parseInt(lineArray[i-1]));
				}
								
				Stack<Integer> oddStack = new Stack<Integer>();
				Stack<Integer> evenStack = new Stack<Integer>();
				
				boolean swi = true;
				
				while(!firstStack.isEmpty()){
					
					if(swi){
						evenStack.push(firstStack.pop());
						swi = false;
					}
					
					else{
						oddStack.push(firstStack.pop());
						swi = true;
					}
					
				}

				
				for(int i = 0; i <= evenStack.size(); i++){
					System.out.print(evenStack.pop() + " ");
				}
				
				

			}
			
			System.out.println("");

		}
	}
}
