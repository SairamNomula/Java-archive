import java.util.Scanner;

public class Lucky{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter a four digit number: ");
            int n = s.nextInt();

            if(!(999 < n && n < 10000)){
                System.out.println(n + " is not a four-digit number");
            }
            else {
            // ABCD
            int fourDigit = n % 10; //D
            int thirdDigit = (n/10) % 10; // ABC % 10 = C
            int secondDigit = (n/100) % 10; // AB%10 = B
            int firstDigit = (n/1000) % 10; // A%10 = A

            if(firstDigit + secondDigit == thirdDigit + fourDigit)
            System.out.println("Lucky");
            else
            System.out.println("Not a lucky number");
        }}
        finally{
            s.close();
        }
    }
}
