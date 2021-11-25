// Write a program that fills an array with n integers entered by the user.

import java.util.Scanner;

public class Ex1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements? (Max is 20): ");
        int n = input.nextInt();

        while (n>20 || n<=0){
            System.out.print("Invalid number, try again: ");
            n = input.nextInt();
        }
        int[] numbers = new int[n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);
    }

    private static void printArrayOfIntegers(int[] numbers){
        System.out.print("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[] numbers){
        Scanner input = new Scanner(System.in);

        for(int i =0; i<numbers.length; i++)
        numbers[i] = input.nextInt();
    }
}



// import java.util.Scanner;

// public class Ex1{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);

//         System.out.print("How many elements? (Max is 20): ");
//         int n = input.nextInt();

//         while (n>20 || n<=0){
//             System.out.print("Invalid number, try again: ");
//             n = input.nextInt();
//         }
//         int[] points = new int[n];
//         fillArrayOfPoints(points);
//         printArrayOfPoints(points);
//     }

//     private static void printArrayOfPoints(int[] numbers){
//         System.out.print("The elements are: ");
//         for(int i =0; i<points.length; i++)
//         System.out.println("(" + points[i].x + "," + points[i].y+")");
//     }

//     private static void fillArrayOfPoints(Point[] points){
//         Scanner input = new Scanner(System.in);

//         for(int i =0; i<points.length; i++) {
//         System.out.println("enter x and y for point" + (i+1) +":");
//         points[i] = new Point(input.nextInt(), input.nextInt());
//     }
// }