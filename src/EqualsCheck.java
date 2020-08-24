public class EqualsCheck {

    //== checks if both objects point to the same memory location whereas . equals() evaluates to the comparison of values in the objects.

    public static void main(String args[]) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcde");
        String s4 = new String("abcde");

        //== operators for reference comparison (address comparison)
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);  //false
        //.equals() method for content comparison.
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));


        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s3.intern() == s1.intern());

        System.out.println(s3.intern());
        System.out.println(s1.intern().equals(s3.intern()));
    }
}
