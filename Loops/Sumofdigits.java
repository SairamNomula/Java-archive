import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter your number: ");

            int n = s.nextInt();
            int sum = 0;
            while(n>0){
                sum += n %10; //ABC --> AB
                n /=10; //AB --> A
            }
            System.out.println("sum= "+sum);
        }
        finally{
            s.close();
        }
    }
}
