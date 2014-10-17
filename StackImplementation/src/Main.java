import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * Stack Implementation Programming Challenge
 * By Jarrod Z. Thibodeau
 * October 17th, 2014
 *
 * Purpose: Create a stack interface of integers, and push elements into it.
 * Then for every other element, pop and display the element, otherwise just pop it.
 *
 */
public class Main {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            if (lineArray.length > 0) {

                //Creating a new instance of my stack class
                //Which has the length of the string array
                Stack myStack = new Stack(lineArray.length);

                //Pushing converted ints into my stack
                for(int i = 0; i < myStack.theSize; i++){
                    myStack.push(Integer.parseInt(lineArray[i]));
                }

                //For every even stack elements, pop & display,
                //Otherwise, pop
                for(int i = 0; i < myStack.theSize; i++){
                    if(i % 2 == 0)
                    {
                        System.out.print(myStack.pop() + " ");
                    }

                    else
                    {
                        myStack.pop();
                    }
                }

                System.out.println("");

            }
        }
    }


        /**
         * Stack class used for implementation
         * Uses the typical push and pop methods
         */

        static public class Stack {

            //Attributes
            private int theSize;
            private int[] stackArray;
            private int top;


            //Stack constructor that takes an int
            public Stack(int s) {

                theSize = s;
                stackArray = new int[theSize];
                top = -1;

            }

            //Stack push function
            public void push(int i) {
                stackArray[++top] = i;

            }

            //Stack pop function
            public int pop() {
                return stackArray[top--];

            }

            //Stack peep function
            public int peek() {
                return stackArray[top];
            }

        }


}
