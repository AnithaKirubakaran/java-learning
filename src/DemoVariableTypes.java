import java.util.Scanner;

public class DemoVariableTypes {
    //static variable
    static int a;

    //Instance Variable
    boolean flag = true;
    String day;

    public static void main(String arg[]) {
        DemoVariableTypes.a = 20;
        System.out.println(a);
        DemoVariableTypes demoVariableTypes = new DemoVariableTypes();
        demoVariableTypes.demo();

        System.out.println("Enter the present day : ");
        Scanner scanner=new Scanner(System.in);
        demoVariableTypes.day=scanner.next();
        demoVariableTypes.demoSwitch();
    }

    void demo() {
         a = -10;
        //Local Variable
        int b = 5;
        System.out.println(a + b);
    }

    void demoSwitch() {
        switch (day) {
            case "Mon":
                System.out.println("day 1");
                break;
            case "Tue":
                System.out.println("day 2");
                break;
            case "Wed":
                System.out.println("day 3");
                break;
            case "Thur":
                System.out.println("day 4");
                break;
            case "Fri":
                System.out.println("day 5");
                break;
            case "Sat":
                System.out.println("day 6");
                break;
            case "Sun":
                System.out.println("day 7");
                break;
            case "default":
                System.out.println("holiday" +flag);
                break;
        }
    }
}
