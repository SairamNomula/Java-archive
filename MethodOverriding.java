// Method overriding can be defined as an object-oriented concept in which subclass/child menthod is evaluated instead of superclass/parent method provided that the signature of both subclass and superclass method is similar.

class A{
    public void show()
     {
         System.out.println("in A");
     }
 }
 class B extends A{
     public void show()
     {
         show();
         System.out.println("in B");
     }
 }
 public class MethodOverriding{
     public static void main(String[] args){
          B obj1 = new B();
         obj1.show();
         }
 }

// ------------------------------------------------

class Vehicle{
    void move(){
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle{
    void move(){
        System.out.println("Car is moving automatically");
    }
}

class MethodOverriding{
    public static void main(String []args){
        Car obj = new Car();
        obj.move();
    }
}

// ----------------------------------------------

// Real world example
// Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However,the rate of interest varies according to banks. For example, SBI, ICICI and CUB banks could provide 8%,7%, and 9% rate of interest.

class Bank{
    int getROI(){
        return 0;
    }
}

class SBI extends Bank{
    int getROI(){
        return 8;
    }
}

class ICICI extends Bank{
    int getROI(){
        return 7;
    }
}

class CUB extends Bank{
    int getROI(){
        return 9;
    }
}

class MethodOverriding{
    public static void main(String[]args){
        SBI s = new SBI();
        ICICI i = new ICICI();
        CUB a = new CUB();

        System.out.println("SBI Rate of Interest: "+s.getROI());
        System.out.println("ICICI Rate of Interest: "+i.getROI());
        System.out.println("CUB Rate of Interest: "+a.getROI());
    }
}

// Java method overriding is mostly used in Runtime Polymorphism.


//  A static method cannot be overridden. It can be proved by runtime polymorphism. It is because the static method is bound with class whereas instance method is bound with an object.Static belongs to the class area, and an instance belongs to the heap area.