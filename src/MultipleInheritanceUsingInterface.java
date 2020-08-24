// A simple Java program to demonstrate multiple
// inheritance through default methods.
interface MultipleInheritanceUsingInterface {
    // default method
    default void show() {
        System.out.println("Default PI1");
    }
}

interface MultipleInterface {
    default void show() {
        System.out.println("Default PI2");
    }
}

class TestClass implements MultipleInheritanceUsingInterface, MultipleInterface {
    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.show();
    }

    @Override
    public void show() {
        // use super keyword to call the show
        // method of PI1 interface
        MultipleInheritanceUsingInterface.super.show();

        // use super keyword to call the show
        // method of PI2 interface
        MultipleInterface.super.show();
    }
}