// Arrays Class
// A class that contains some static methods that are used with arrays.
// * Sorting
// * Searching
// * Comparing
// * Filling
// * Returning a string representation of an array.


// SORTING
// sort(array): sorts the whole array
int[] numbers = {2,3,6,9,1,0};
Arrays.sort(numbers); // 0,1,2,3,6,9
Arrays.sort(numbers, 1, 4); //1,3,6,9

// -------------------------------------------------
// SEARCHING
// Using binarySearch()

// -  The array should be sorted in increasing order
// -  binarySearch(array, element)
// -  binarySearch(numbers, 4)

// Return values
// - Index of element inside the array if exists
// - -(insertionIndex + 1) if the element was not found

int[] numbers = {2,3,6,9,1,0};
Arrays.sort(numbers); // 0,1,2,3,6,9
System.out.println(Arrays.binarySearch(numbers, 6)); // 4
System.out.println(Arrays.binarySearch(numbers, 9)); // 5
System.out.println(Arrays.binarySearch(numbers, 1)); // 1
System.out.println(Arrays.binarySearch(numbers, -5)); // -1
System.out.println(Arrays.binarySearch(numbers, -10)); // -7
// -------------------------------------------------
