//The array arr is declared as final, but the elements of array are changed without any problem.
// Arrays are objects and object variables are always references in Java. So, when we declare an object variable as final,
// it means that the variable cannot be changed to refer to anything else.

public class FinalArray {
    public static void main(String args[]) {
        final int arr[] = {1, 2, 3, 4, 5}; // Note: arr is final
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);
        }
    }
}

/* Program 2 - So a final array means that the array variable which is actually a reference to an object,
   cannot be changed to refer to anything else, but the members of array can be modified.
   
class Test
{
    int p = 20;
    public static void main(String args[])
    {
       final Test t1 = new Test();
       Test t2 = new Test();
       t1 = t2;
       System.out.println(t1.p);
    }
}
Output: Compiler Error: cannot assign a value to final variable t1 */
