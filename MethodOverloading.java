// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
// If we have to perform only one operation, having same name of the methods increases the readability of the program.
// Advantage of method overloading
// Method overloading increases the readability of the program.

// Different ways to overload the method
// There are two ways to overload the method in java
// 1. By changing number of arguments
// 2. By changing the data type

// In Java, Method Overloading is not possible by changing the return type of the method only.

class Casio{
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void add(int i, int j, int k){
        System.out.println(i+j+k);
    }
    public void add(double i, double j){
        System.out.println(i+j);
    }
}

public class MethodOverloading{
    public static void main(String[]args){
        Casio obj = new Casio();
        
        obj.add(12,241);
        obj.add(214,51,645);
        obj.add(21.5,73.21);
    }
}

// Result:
// 253
// 910
// 94.71