import java.util.Scanner;

public class MinMax {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        try{
            int n = s.nextInt();
            int max = n;
            int min = n;

                if(n>=0){
            while(true){
                n = s.nextInt();
                
                if(n<0)
                break;

                max = n > max ? n : max;
                
                // if(n> max)
                // max=n;

                min = n < min ? n : min;
                // if(n<min)
                // min=n;

                System.out.println("min= " + min + ", max= " + max);
            }   
        }
        else
        System.out.println(n + " is invalid");
        }
        finally{
            s.close();
        }
    }
}
