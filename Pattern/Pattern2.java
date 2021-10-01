// Write a program that reads a positive integer N and displays the following:
// N = 4:
//    *
//   ***
//  *****
// *******

import java.util.Scanner;

public class Pattern2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        try{
            for(int i = 1; i<=n; i++){

                for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

                for(int j = 1; j <= 2*i - 1; j++)
                System.out.print("*");

                System.out.println();
            }
        }
        finally{
            s.close();
        }
    }
}
