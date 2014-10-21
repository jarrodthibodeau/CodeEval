import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Prime Numbers CodeEval Problem
 * By Jarrod Z. Thibodeau
 * October 20th, 2014
 *
 * Problem: Given a number, find all the prime numbers below the the given number
 */
public class Main {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {

            int theNumber = Integer.parseInt(line);
            ArrayList<Integer> primes = new ArrayList<Integer>(); //Stores the primes

            /*
                Loop to find prime numbers under the given number
             */
            for(int i = 2; i < theNumber; i++){
                if(isPrime(i) == true){
                    primes.add(i);
                }
            }

            /*
                Loop used to avoid the comma at the end
                Displays all of the prime numbers

             */
            for(int i = 0; i < primes.size(); i++){
                if(i+1 == primes.size()){
                   System.out.println(primes.get(i));
                }

                else{
                    System.out.print(primes.get(i)+ ",");
                }

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
