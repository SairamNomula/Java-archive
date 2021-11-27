// Writing a program that displays the number of occurences of an element in the array.

public class Ex3 {
    public static void main(String[]args){
        int[] numbers = {1,1,1,2,3,4};
        int searchElement = 3;

        System.out.println(getNumberOcc(numbers, searchElement));
    }

    public static int getNumberOcc(int[] numbers, int searchElement){
        int occ = 0;
        for(int i =0; i< numbers.length; i++)
            if(searchElement == numbers[i])
            occ++;

            return occ;
    }
}
