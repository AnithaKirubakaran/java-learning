public class AutoBoxingUnBoxing {
    /*Adv: Primitive int is mutable (It is not the case with final int) while Wrapper Integer is immutable.
    It will create new object when we change the value.*/
    //Boxing is when you convert a primitive type to a reference type, un-boxing is the reverse.

    public static void main(String arg[]) {
        AutoBoxingUnBoxing ab = new AutoBoxingUnBoxing();
        ab.auBoxing();
        ab.unBoxing();
        shows();
        shows(5);
    }

    public void auBoxing() {

        //Autoboxing of char
        Character gfg = 'a';

        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
    }

    public void unBoxing() {

        // creating an Integer Object
        // with value 10.
        Integer i = new Integer(10);

        // unboxing the Object
        int i1 = i;

        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);
    }

    //overloading of static method
    public static void shows(){
        System.out.println("Value of i: " );
    }

    //overloading of static method
    public static void shows(int a){
        System.out.println("Value of i: " +a);
    }
}
