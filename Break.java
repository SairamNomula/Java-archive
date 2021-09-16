import java.util.Scanner;

public class Break {
    public static void main(String[]args){
        // int n = 5;
        // switch(n){
        //     case 10:
        //     System.out.println("=10");
        //     break;
        //     case 90:
        //     System.out.println("=90");
        //     break;
        //     default:
        //     System.out.println("None");
        // }

        Scanner s = new Scanner(System.in);
        try{
        int n = s.nextInt();
            switch(n%2){
                case 0:
                System.out.println("even");
                break;
                default:
                System.out.println("odd");
            }}
            finally{
                s.close();
            }
        }
    }

