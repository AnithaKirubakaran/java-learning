//Method Hiding
class ParentClass {
    public static void printMe() {
        System.out.println("Inside Parent Class");
    }
}
class ChildClass extends ParentClass{
    public static void printMe() {
        System.out.println("Inside Child Class");
    }
}

public class MethodHiding {
    public static void main(String args[]) {
        ParentClass a = new ChildClass();
        /*MethodHiding methodHiding=new MethodHiding();
        printMe();*/
        /*ParentClass a = new ParentClass();
        ChildClass m= new ChildClass();
        a.printMe();
        m.printMe();*/
       a.printMe();  //o/p: Inside Parent Class  [without static method o/p : Inside Child Class]
        //ParentClass.printMe();
        //ChildClass.printMe();
    }

    /*public static void printMe() {
        System.out.println("Inside Child Class");
    }*/
}

