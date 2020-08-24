import java.io.*;

//For explanation with more examples : https://www.geeksforgeeks.org/serialization-in-java/
// https://javabeginnerstutorial.com/core-java-tutorial/transient-vs-static-variable-java/

public class EmpDeserialize implements Serializable{
    private static final long serialversionUID = 129348938L;

    public static void main(String[] args) {

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream
                    ("example.txt");
            ObjectInputStream in = new ObjectInputStream
                    (file);

            // Method for deserialization of object
            EmpSerialize emp = (EmpSerialize)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");

/*  In case of  transient variables:- A variable defined with transient keyword is not serialized during serialization process.This variable will be initialized with default value during deserialization. (e.g: for objects it is null, for int it is 0).
    In case of static Variables:- A variable defined with static keyword is not serialized during serialization process.This variable will be loaded with current value defined in the class during deserialization.*/
            //emp.a = 2000;
           // emp.b =100000;
            SerialExample.printdata(emp);
            System.out.println("Education: "+emp.education);
            // System.out.println("z = " + object1.z);
        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }
    }
}

