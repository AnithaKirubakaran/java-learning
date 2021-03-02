public class NestedInnerClass {
    static String abc = "outer class";
    static class InnerClass{
        public void show(){
            System.out.println("Nested inner class is also static inner class and string abc is from : " +abc);
        }
    }
}
class NewClass{
    public static void main(String arg[]){
        NestedInnerClass.InnerClass objreff = new NestedInnerClass.InnerClass();
        objreff.show();
    }
}
