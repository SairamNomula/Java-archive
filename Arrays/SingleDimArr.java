// Array is a collection of variables of the same data type.
// An array in java is an object.
// An array variable references a group of data.
// The size of an array is fixed.

// -----------------------------------------------------------------------

// One Dimensional Array in java is always used with only one subscript([]). 
// A one-dimensional array behaves likes a list of variables. we can access the variables of an array by using an index in square brackets preceded by the name of that array. Index value should be an integer.

dataType[] arrayName; // null
(or)
arrayName = new dataType[10]; // Address of the 10 elements of type datatype
(or)
dataType[] arrayName = new dataType[20];
int[] numbers = new int[20];


// datatype can be a primitive data type(int, char, Double, byte etc.)or Non-primitive data (Objects)
// arrayName is the name of an array
// [] is called subscript.


// -----------------------------------------------------------------------


// Accessing array elements
// Use brackets and indices
int[] numbers = new int[5]; // {0,0,0,0,0}
numbers[0] = 5; // {5,0,0,0,0}
numbers[2] = 8; // {5,0,8,0,0}
numbers[4] = 11; // {5,0,8,0,11}
(or)
int number[];
(or)
int []number;


// Array Initializers
double[]numbers = {1.9,1.2,23.2};

double[]numbers = new double[3];
numbers[0] = 1.9;
numbers[1] = 1.2;
numbers[2] = 23.2;

double[] numbers;
numbers = {1.9,1.2,23.2}; --> // Error


// -----------------------------------------------------------------------

// Anonymous Arrays
// An array without a variable referencing it

new Scanner(System.in).nextDouble();
new int[] {1,2,3,4};
printArray(new int[] {1,2,3,4});

// -----------------------------------------------------------------------

// Exceeding Array Bounds
// The indices must be between 0 and length -1

char[] chars = {'a','b','c','d'};

// Index -1 out of bonds for length 4
System.out.println(chars[-1]);

// Index 4 out of bounds for length 4
System.out.println(chars[4]);

System.out.println(chars); //abcd
// -----------------------------------------------------------------------

// Passing arrays to methods
// Arrays are passed by reference

public static void main(String[]args){
    int[] numbers = {0,1};
    change(numbers);
    printArray(numbers); // 1 0
}

public static void change(int[]numbers){
    numbers[0] = 1; // {1,1}
    numbers[1] = 0; // {1,0}
}

public static void printArray(int[] numbers){
    for(int i = 0; i < numbers.length; i++)
    System.out.print(numbers[i] + " ");
}

// -----------------------------------------------------------------------

// Returning arrays from methods

public static int[] getNumbers(){
    int[] numbers = {1,2,3,4,5};

    return numbers;
}

public static int[] getNumbers(){
    return new int[] {1,2,3,4,5};
}