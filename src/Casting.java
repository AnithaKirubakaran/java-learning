public class Casting {
    public static void main(String arg[]) {
        //Type casting is when you assign a value of one primitive data type to another type

        /*i)Widening Casting (automatically) - converting a smaller type to a larger type size
        byte ->short ->char ->int ->long ->float ->double*/
        char mychar = 'i';
        double myDouble = mychar;
        float myfloat = 1.2f;
        double dbl = myfloat;
        System.out.println(myfloat);
        System.out.println(dbl);
        System.out.println(mychar);
        System.out.println(myDouble);

        /*ii)Narrowing Casting (manually) - converting a larger type to a smaller size type
        double ->float ->long ->int ->char ->short ->byte*/
        double miDouble = 9.78;
        int miInt = (int) myDouble;
        System.out.println(miDouble);
        System.out.println(miInt);
    }
}
