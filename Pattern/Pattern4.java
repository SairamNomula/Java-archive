// N=4
// ****
// ****
// ****
// ****

import java.util.Scanner;

public class Pattern4{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    try{
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n; j++)
            System.out.print("*");

            System.out.println();
        }
    } 
    finally{
        s.close();
        }
    }
}