// Create an inheritance hierarchy of Rodent Mouse, Gerbil, Hamster etc. In the baseclass, provide methods that are common to all Rodents and override these in the derived classes to perform different behaviours depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your baseclass methods. Explain what happens.


package Inheritance;

class Rodent{
    void place(){}
    void tail(){}
}

class Mouse extends Rodent{
    void place(){
        System.out.println("Mice are found all over the world");
    }
    void tail(){
        System.out.println("Long and hairless tail");
    }
}

class Gebril extends Rodent{
     void place(){
         System.out.println("Gebril are found in arid parts of Africa and Asia");
     }
     void tail(){
         System.out.println("Long tail");
     }
}

class Hamster extends Rodent{
    void place(){
        System.out.println("Hamsters are found in dry regions");
    }
    void tail(){
        System.out.println("Short tail");
    }
}

class Beaver extends Rodent{
    void place(){
        System.out.println("Beavers are found in Northern Europe and America");
    }
    void tail(){
        System.out.println("Broad tail");
    }
}

public class Ex2{
    public static void main(String[]args){
        Rodent r[] = new Rodent[6];
        for(int i=0;i<r.length;i++)
        r[i]=randRodent();

        for(int i=0; i<r.length;i++){
            r[i].place();
            r[i].tail();
        }
    }
    public static Rodent randRodent(){
        switch((int)(Math.random()*4)){
            default:
            case 0: return new Mouse();
            case 1: return new Gebril();
            case 2: return new Hamster();
            case 3: return new Beaver();
        }
    }
}