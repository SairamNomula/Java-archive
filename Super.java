// The super keyword in Java is a reference variable which is used to refer immediate parent class object.

// Super is used by subclass to refer to its immediate superclass(parent class)
// can be used to invoke immediate parent class method.
// super() can be used to invoke immediate parent class constructor.


class A{
    public A(){
        System.out.println("in A");
    }
    public A(int i){
        System.out.println("in A int");
    }
    
}
class B extends A{
   public B(){
       super();
        System.out.println("in B");
   }
    public B(int i){
        super(i);
        System.out.println("in B int");
    }
    
}
public class Super{
    public static void main(String[] args){
        B obj1 = new B(14);
    }
}

// Note: super() is added in each class constructor automatically by compiler if there is no super() or this().

// ------------------------------------------

// Real use of super keyword. Here, Emp class inherits Person class so all the properties of Person will be inherited to Emp by default. To initialize all the property, we are using parent class constructor from child class. In such way, we are reusing the parent class constructor.

class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
}

class Emp extends Person{
    float salary;
    Emp(int id, String name, float salary){
    super(id,name);
    this.salary=salary;
}
void display(){
System.out.println(id+" "+name+" "+salary);
    }
}
class Super{
    public static void main(String[]args){
        Emp e1=new Emp(1,"Sairam",100000f);
        e1.display();
    }
}