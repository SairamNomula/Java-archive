// Explain the member access mechanism in inheritance with an example?

package Inheritance;

class Calc{
    private void calculate(){
        System.out.println("Hello 1");
    }
    public void display(){
        System.out.println("Hello 2");
    }
    public void show(){
        System.out.println("Hello 3");
    }
}

public class Ex1 extends Calc{
    public void display(){
        System.out.println("OK 1");
        super.display();
    }
    public static void main(String args[]){
        Ex1 d1 = new Ex1();
        d1.display();
        d1.show();
    }
}