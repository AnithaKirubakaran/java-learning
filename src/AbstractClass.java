abstract class CallingClass {
    abstract void getValue(int value);

    //abstract method cannot have body
    /*abstract void getValues(int value){
        System.out.println("abstract method cannot have body");
    }*/

    //non-abstract method can have body
    void abstractMethod() {
        System.out.println("abstract class can be declared and defined");
    }
}

class FinalCheck extends AbstractClass {
    void getValue(int value) {
        final int THRESHOLD = 7;
        System.out.println("Abstract overrided function " + value + " " + THRESHOLD);
    }
}

public class AbstractClass extends CallingClass {

    //instead public static void main(String args[]) (static public void main(String args[])) order dosen't matter in java
    static public void main(String args[]) {
        CallingClass cls = new AbstractClass();
        cls.getValue(12);
        //cls.abstractMethod();
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.main();
        FinalCheck finalCheck = new FinalCheck();
        finalCheck.getValue(10);
        //finalCheck.THRESHOLD=15; //final variable cannot be changed at runtime
    }

    @Override
    void getValue(int value) {
        final int THRESHOLD = 5;
        System.out.println("Abstract overrided function " + value + " " + THRESHOLD);
        abstractMethod();
    }

    void main() {
        System.out.println("this is to represent overloading of main method");
    }
}
