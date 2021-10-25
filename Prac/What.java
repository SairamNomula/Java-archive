// ODD or EVEN

import java.util.Scanner;

public class What {
    public static void main(String[]args){
        System.out.print("Enter a number: ");

        Scanner s = new Scanner(System.in);
        try{
        int n = s.nextInt();

        if(n%2==0)
        System.out.println("even");

        // if(n%2==1)
        // System.out.println("odd");

        if(!(n%2==0))
        System.out.println("odd");
    }
        finally {
            s.close();
        }
    }
}
