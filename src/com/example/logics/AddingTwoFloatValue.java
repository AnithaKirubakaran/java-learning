package com.example.logics;

public class AddingTwoFloatValue {
    public static int addNumbers(float a, float b){
        float f=Float.sum(a,b);
        return (int) f;
    }
    public static void main(String arg[]){
        AddingTwoFloatValue.addNumbers( 2.3f, 1.9f);
    }
}
