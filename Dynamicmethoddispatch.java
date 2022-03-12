class A{
    public void show(){
    System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C");
    }
}

public class Dynamicmethoddispatch{
    // compiletime and runtime
    public static void main(String[]args){
        A obj1=new B(); //runtime polymorphism
        obj1.show();
        
        obj1=new C();
        obj1.show(); //Dynamic Method Dispatch
    }
}