// public class Reverse {
//     public static void main(String[]args){
//         String str = "sairam";

//         for(int i = str.length()-1; i >= 0; i--)
//         System.out.print(str.charAt(i));

//     }
// }

public class Reverse {
    public static void main(String[]args){
        String str = "rudra ram";
        String reverse ="";

        for(int i = str.length()-1; i >= 0; i--)
        reverse += str.charAt(i); // reverse = reverse + str.charAt(i)

        System.out.println(reverse);
    }
}