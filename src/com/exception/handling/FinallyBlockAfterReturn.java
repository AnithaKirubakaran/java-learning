package com.exception.handling;

public class FinallyBlockAfterReturn {
    public static int myMethod()
    {
        try {
            //try block
            System.out.println("Inside try block");
            return 0;
        }
        finally {
            //finally
            System.exit(0);
            System.out.println("Inside Finally block");
        }
    }
    public static void main(String args[])
    {
        System.out.println(FinallyBlockAfterReturn.myMethod());
    }
}
