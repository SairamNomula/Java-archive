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