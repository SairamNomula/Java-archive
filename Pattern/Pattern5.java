// N = 3
// ***
// * *
// ***

import java.util.Scanner;
public class Pattern5 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        try{
            for (int i = 1; i <= n; i++){
                if(i == 1 || i == n)
                
            for (int j = 1; j<= n; j++)
                    System.out.print("*");

            else
                for(int j =1; j<= n; j++)
                    if(j == 1 || j ==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");

            System.out.println();
            }
        }

        finally{
            s.close();
        }
    }
}
