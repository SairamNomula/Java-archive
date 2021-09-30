// Write a program which displays a string with a space after each character.

// Hint : Use charAt() method


public class Space {
    public static void main(String[]args){
        String str = "sairam nomula";

        for(int i = 0; i <= str.length() - 1; i++)
        System.out.print(str.charAt(i) + " ");
    }
}
