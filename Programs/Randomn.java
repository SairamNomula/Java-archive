import java.lang.Math;

public class Randomn {
    public static void main(String[]args){
        System.out.println("Random Number :" + Math.random());
    }
}
// ---------------------------------------------------------------

// Another way to generate a random number is to use the Java Random class of the java.util package. It generates a stream of pseudorandom numbers. We can generate a random number of any data type, such as integer, float, double, Boolean, long.
// nextInt(int bound)
// nextInt()
// nextFloat()
// nextDouble()
// nextLong()
// nextBoolean()
// All the above methods return the next pseudorandom, homogeneously distributed value (corresponding method) from this random number generator's sequence. The nextDouble() and nextFloat() method generates random value between 0.0 and 1.0.

// The nextInt(int bound) method accepts a parameter bound (upper) that must be positive. It generates a random number in the range 0 to bound-1.


import java.util.Random;
public class Randomn{
    public static void main(String[]args){
        Random random = new Random(); // creating an object of Random class

        int x = random.nextInt(50);
        System.out.println("Random no: ");
        System.out.println(x);

        double a = random.nextDouble();
        System.out.println("Random no: ");
        System.out.println(a);

        float f=random.nextFloat();
        System.out.println("Random no: ");
        System.out.println(f);

        long p = random.nextLong();
        System.out.println("Random no: ");
        System.out.println(p);

        boolean b=random.nextBoolean();
        System.out.println("Random value: ");
        System.out.println(b);
    }
}

// ---------------------------------------------------------------

