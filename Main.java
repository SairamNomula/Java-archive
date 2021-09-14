import java.util.Scanner;

public class Main{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    try{
    String name = input.nextLine();
    double age = input.nextDouble();

    System.out.println(name + "!" + age + " old!");
    }
    finally{
        input.close();
    }
    }
}
