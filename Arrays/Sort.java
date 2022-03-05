// The sorting is a way to arrange elements of a list or array in a certain order. The order may be in ascending or descending order. The numerical and lexicographical (alphabetical) order is a widely used order.

// Arrays is the class defined in the java.util package that provides sort() method to sort an array in ascending order. It uses Dual-Pivot Quicksort algorithm for sorting. Its complexity is O(n log(n)). It is a static method that parses an array as a parameter and does not return anything. We can invoke it directly using the class name. It accepts an array of type int, float, double, long, char, byte.

import java.util.Arrays;
public class Sort {
    public static void main(String[]args){
        int array[] = new int[]{12,52,45,14,6,21,2};

        Arrays.sort(array);
        System.out.println("Sorted: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}


// Note: Like the Arrays class, the Collections class also provides the sort() method to sort the array. But there is a difference between them. The sort() method of the Arrays class works for primitive type while the sort() method of the Collections class works for objects Collections, such as LinkedList, ArrayList, etc.

// -------------------------------------------------------------------------------------

// Descending order
import java.util.Arrays;
public class Sort {
    public static void main(String[]args){
        int desc[] = new int[]{12,52,45,14,6,21,21};
        int temp=0;
        
        System.out.println("Org array: ");
        for(int i=0;i<desc.length;i++){
        System.out.print(desc[i] + " ");
        }
        for(int i=0;i<desc.length;i++){
            for(int j=i+1;j<desc.length;j++){
                if(desc[i]<desc[j]){
                    temp=desc[i];
                    desc[i]=desc[j];
                    desc[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Desc order: ");
        for(int i=0;i<desc.length;i++){
            System.out.print(desc[i]+" ");
        }
    }
}