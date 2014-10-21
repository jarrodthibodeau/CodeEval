import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Counting Primes CodeEval Problem
 * By Jarrod Z. Thibodeau
 * October 20th, 2014
 *
 * Problem: Given two numbers, a beginning and a end. Find out what numbers in between your
 * beginning and end are prime numbers

 */
public class Main {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(",");
            if (lineArray.length > 0) {

                int start = Integer.parseInt(lineArray[0]); //Grabbing start position
                int end = Integer.parseInt(lineArray[1]); //Grabbing end
                int count = 0; //Counts how many primes

                //Looping through each number to checl
                //if they are prime or not
                for(int i = start; i <= end; i++){
                    if(isPrime(i) == true){
                        count++;
                    }
                }

                System.out.println(count); //printing out counter


            }
        }
    }

    /*
        Simple method that checks if a number
        is a prime number of not

     */
    static boolean isPrime(int x){
        for(int i = 2; i<x; i++){
            if(x % i == 0){
                return false;
            }
        }

        return true;
    }

}
