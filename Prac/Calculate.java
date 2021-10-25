import java.util.Scanner;

public class Calculate{
    public static void main(String[]args){
        System.out.print("Follow this pattern:- num1 op num2: ");

        Scanner s = new Scanner(System.in);
        try{
        double d1 = s.nextDouble();
        char op = s.next().charAt(0);
        double d2 = s.nextDouble();

        if(op=='+')
        System.out.println((int)(d1+d2));
        else if(op=='-')
        System.out.println((int)(d1-d2));
        else if (op=='/')
        System.out.println(d1/d2);
        else if (op=='*')
        System.out.println((int)(d1*d2));
        else
        System.out.println("Invalid input!");
    }
    finally{
        s.close();
    }
    }
}