// The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

class student{
    int sid;
    double gpa;
    static String fa;
    
    static{         // when you load a class
        fa="Shiny";
    }

    public student(){ // when you create an object
        sid=1;
        gpa=10;
    }

    public void show(){
        System.out.println(sid+":"+gpa+":"+fa);
    }
}

public class Static{
    public static void main(String[]args){
        student sairam = new student();
        sairam.sid=21;
        sairam.gpa=9.2;
        student.fa="senthil"; // To access a static var, we dont need object.
        
        student lavan = new student();
        lavan.sid=69;
        lavan.gpa=10;
        student.fa="senthil";

        sairam.show();
        lavan.show();
    }
}