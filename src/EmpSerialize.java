import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//For explanation with more examples : https://www.geeksforgeeks.org/serialization-in-java/
// https://javabeginnerstutorial.com/core-java-tutorial/transient-vs-static-variable-java/

public class EmpSerialize implements Serializable , variableConstant {
    private static final long serialversionUID = 129348938L;
    static int b;
    transient int a;
    static transient String name;
    int age;

    // Default constructor
    public EmpSerialize(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
   // public static String education = "MBA";

}

interface variableConstant  {
    public static final String education = "MCA";
}

class SerialExample {
    public static void printdata(EmpSerialize object1) {

        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }

    public static void main(String[] args) {
        EmpSerialize object = new EmpSerialize("ab", 20, 2, 1000);
        String filename = "example.txt";

        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printdata(object);

            // value of static variable changed
            object.b = 2000;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }
}