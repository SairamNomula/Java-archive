import java.util.Scanner;

public class Strictdivs{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int i = 1;
            int n = s.nextInt();
            int sum = 0;
            
            for(; i <= n/2; i++);
            if(n % i==0)
            sum += 1;

            System.out.println(sum);
        
        }
        finally{
            s.close();
        }
    }
}