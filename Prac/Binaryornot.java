import java.util.Scanner;
public class Binaryornot
{
            public static void main(String args[])
        {
                   int r=0,c=0,num,b;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter a number");
              num=sc.nextInt();
              sc.close();
              b= num;
              while(num>0)
                   {
                      if((num %10==0)|| (num%10==1))
                         c++;
                         r++;
                         num=num/10;
                   }
                      if(c==r)
               System.out.println(b+" is a Binary Number.");
               else
               System.out.println(b+" is not a Binary Number");
           }
}

