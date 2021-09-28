// It is a sequence of numbers where the first two number in the sequence are 1 and 1.
// Then, each additional Fibonacci number is the sum of the two previous numbers in the sequence.
// Example: 1,1,2,3,5,8,13,21,...


// To get nth Fibonacci number, we need n-2 steps.


//Question: 
// Write a program that reads an integer n and displays the nth Fibonacci number.

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter a positive integer n: ");
            int n = s.nextInt();

            int result = 0;
            int v1 = 1;
            int v2 = 1;
            for (int i = 1; i <= n-2; i++){
                result = v1 + v2;
                v1 = v2;
                v2 = result;
            }
            System.out.println("result = " + (result == 0 ? 1 : result));
        }
        finally{
            s.close();
        }
    }
}