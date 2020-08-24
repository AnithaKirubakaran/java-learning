public class MethodInnerClass {
    int a =5;
    class InnerClass{
        public void show(){
            System.out.println("inner class with value a : " +a);
        }
    }
}
class New{
    public static void main(String[] args) {
        MethodInnerClass methodInnerClass=new MethodInnerClass();
        MethodInnerClass.InnerClass objRef=methodInnerClass.new InnerClass();
        objRef.show();
    }
}
