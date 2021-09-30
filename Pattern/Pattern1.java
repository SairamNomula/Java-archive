// Write a program that reads a positive integer N and displays the following:
// N = 4:
//     *
//    **
//   ***
//  ****


import java.util.Scanner;

public class Pattern1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter you input now!");
        int n = s.nextInt();
        try{
            for(int i = 1; i<=n; i++){

                for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

                for(int k = 1; k <= i; k++)
                System.out.print("*");

                System.out.println();
            }
        }
        finally{
            s.close();
        }
    }
}