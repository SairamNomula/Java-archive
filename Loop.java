// Loops are used to execute a block of code more than once.
// While loop, Do while loop, For loop

// while loop 
// public class Loop {
//     public static void main(String[]args){
//         int i = 2;
//         while(i<=5){
//             System.out.println("Token number " + i);
//             i++;
//         }
//     }
//     }

// import java.util.Scanner;

// public class Loop{
//     public static void main(String[]args){
//         Scanner s = new Scanner(System.in);
//         try {
//             System.out.println("enter a number between 1 and 10: ");
//             int n = s.nextInt();

//             while(n < 1 || n > 10){
//                 System.out.println( n + " is not between 1 and 10. Try again: ");
//                 n = s.nextInt();
//             }
//             System.out.println(n + " is between 1 and 10.");
//         }

//         finally{
//             s.close();
//         }
//     }
// }





//------- Do while loop-------- //

// import java.util.Scanner;

// public class Loop{
//     public static void main(String[]args){
//         Scanner s = new Scanner(System.in);
//         try{
//             int n;
//             do{
//                 System.out.println("Enter a number: ");
//                 n= s.nextInt();

//             } while (n<1 || n>10);
//             System.out.println(n + " is between 1 and 10");
//         }
//         finally{
//             s.close();
//         }
//     }
// }





// -----For Loop-----
// public class Loop{
//     public static void main(String[]args){
//         for (int i = 1; i<=5; i++ );
//         System.out.println("");
//     }
// }




// ------Nested loops--------
// A loop can ber inserted inside another loop.
// These consist of an outer loop and one or more inner loops.
// Each time the outer loop is executed, the inner loops are executed again.

public class Loop{
    public static void main(String[]args){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++)
            System.out.print("*");

            System.out.println();
        }
    }
}