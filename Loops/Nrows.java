// Write a program that reads a positive integer N from the user and display the following:
// 1
// 22
// 333
// NNNNNNN......N

import java.util.Scanner;
public class Nrows{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Type your input now!");
        int n = s.nextInt();
        try{
            
            for (int i = 1; i <= n; i++){

                for (int j =1; j <=i; j++)
                System.out.print(i);
                System.out.println();
            }
        }
        finally{
            s.close();
        }
    }
}