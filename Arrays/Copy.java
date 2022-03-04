// In this program, we need to copy all the elements of one array into another. This can be accomplished by looping through the first array and store the elements of the first array into the second array at the corresponding position.

public class Copy {
    public static void main(String[]args){
        int arr1[] = new int[]{12,3,421};
        int arr2[] = new int[arr1.length]; //Creating another array arr2 with size of arr1

        for(int i = 0; i<arr1.length; i++){ //Copying all elements of one array into another
            arr2[i]=arr1[i];
        }
        System.out.println("Org array elements: ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();    
                
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }
    }
}
