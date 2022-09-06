// 0 1 1 2 3 5 8 13 21

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        int n, first=0, next=1;
        System.out.println("Input: ");
        Scanner sc= new Scanner (System.in);
        n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci series are: ");
        System.out.println(first + " " + next);
        for(int i=1; i<= n-2; ++i){
            int sum = first + next;
            first = next;
            next = sum;
            System.out.println(" "+sum);
        }
    }
}
