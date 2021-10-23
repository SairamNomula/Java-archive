import java.util.Scanner;

public class Getname {
    public static void main(String[]args){
        System.out.println("Enter your name: ");
        System.out.println("Hi" + getName() + " " + getAge() + "Age : ");
    }
    public static String getName(){
        return new Scanner(System.in).nextLine();
    }

    public static double getAge(){
        return new Scanner(System.in).nextDouble();
    }
}
