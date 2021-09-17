import java.util.Scanner;

public class Number {
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        try{
        System.out.print("Enter integer: ");
        int favoriteNumber = in.nextInt();

        System.out.println(favoriteNumber + " is mine too!");}
        finally{
            in.close();
        }
    }
}