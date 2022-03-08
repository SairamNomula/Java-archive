// Varargs is a short name for variable arguments. In Java, an argument of a method can accept arbitrary number of values. This argument that can accept variable number of values is called varargs.

// Syntax:
// accessModifier methodName(datatype… arg) {
//     // method body
// }

// In order to define vararg, ... (three dots) is used in the formal parameter of a method.

// A method that takes variable number of arguments is called a variable-arity method, or simply a varargs method.

class Calc{
    public int add(int ... n){
        int sum=0;
        for(int i : n){
            sum=sum+i;
        }
        return sum;
    }
}

public class Varargs{
    public static void main(String[]args){
        Calc obj = new Calc();
        System.out.println(obj.add(4,5,124,267,2,1,51,78,56));
    }
}

// --------------------------------------------------------
class VarargExample {

    public int Varargs(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
        VarargExample ex = new VarargExample();

        int sum2 = ex.Varargs(2, 4,792,9,2);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.Varargs(1, 3, 5,5549,1,82,9);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.Varargs(1, 3, 5, 7,1,92,91,84);
        System.out.println("sum4 = " + sum4);
    }
}