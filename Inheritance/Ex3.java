// Write a sample program to demonstrate the order to initialization of the base classes and derived classes. Now add member objects to both the base and derived classes and show the order in which their initialization occurs during construction.

// Base class - Parent/Super | Derived class - Child/Sub

package Inheritance;

class Member{
    public Member(String id){
        System.out.println("Member constructor"+id);
    }
}

class Edit{
    Member m1= new Member("e1");
    Member m2=new Member("e2");

    public Edit(){
        System.out.println("Edit constructor");
    }
    public void cut(){
        System.out.println("Edit by cutting");
    }
    public void copy(){
        System.out.println("Edit by copying");
    }
    public void paste(){
        System.out.println("Edit by pasting");
    }
    public String toString(){
        return "Edit";
    }
}

class EditWord extends Edit{
    Member m1=new Member("ew1");
    Member m2=new Member("ew2");
    public EditWord(){
        System.out.println("EditWord constructor");
    }
    public void cut(){
        System.out.println("Editword by cutting");
    }
    public void copy(){
        System.out.println("Editword by copying");
    }
    public void paste(){
        System.out.println("Editword by pasting");
    }
    public String toString(){
        return "EditWord";
    }
}

class EditLine extends Edit{
    Member m1=new Member("el1");
    Member m2=new Member("el2");
    public EditLine(){
        System.out.println("EditLine constructor");
    }
    public void cut(){
        System.out.println("EditLine by cutting");
    }
    public void copy(){
        System.out.println("EditLine by copying");
    }
    public void paste(){
        System.out.println("EditLine by pasting");
    }
    public String toString(){
        return "EditLine";
    }
}

class EditImage extends Edit{
    Member m1=new Member("ei1");
    Member m2=new Member("ei2");
    public EditImage(){
        System.out.println("EditImage constructor");
    }
    public void cut(){
        System.out.println("EditImage by cutting");
    }
    public void copy(){
        System.out.println("EditImage by copying");
    }
    public void paste(){
        System.out.println("EditImage by pasting");
    }
    public String toString(){
        return "EditImage";
    }
}

public class Ex3{
    public static void main(String[]args){
        new EditImage();
    }
}

// During construction, the base class will be initialized first, and then the derived class will be initialized.