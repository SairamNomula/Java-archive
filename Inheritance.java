// Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

// Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

// Why use inheritance in java:
// For Method Overriding (so runtime polymorphism can be achieved).
// For Code Reusability.

// Terms used in Inheritance:
// Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
// Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
// Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
// Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

// The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

// Single level inheritance

class Calc{                     // Superclass/Base/Parent
    public int add(int i, int j){
        return i+j;
    }
}

class CalcAdv extends Calc{         // Subclass/Derived/Child
    public int sub(int i, int j){
        return i-j;
    }
}

public class Inheritance {
    public static void main(String[]args){
        CalcAdv c1 = new CalcAdv();
        int result = c1.add(5,2);
        int result1 = c1.sub(5,2);

        System.out.println(result);
        System.out.println(result1);
    }
}

// ---------------------------------------------

// Multi-level inheritance

class Calc{                     // Superclass/Base/Parent
    public int add(int i, int j){
        return i+j;
    }
}

class CalcAdv extends Calc{         // Subclass/Derived/Child
    public int sub(int i, int j){
        return i-j;
    }
}

class CalcAdvV extends CalcAdv{         // Subclass/Derived/Child
    public int mul(int i, int j){
        return i*j;
    }
}

public class Inheritance {
    public static void main(String[]args){
        CalcAdv c1 = new CalcAdv();
        int result = c1.add(5,2);
        int result1 = c1.sub(5,2);
        int result2 = c1.mul(5,2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}