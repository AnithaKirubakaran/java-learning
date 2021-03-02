package com.example.logics;

import java.util.Scanner;

public class Reverse {
    
    //Reverse string
    public static void reverseString() {
        String name = "anitha";
        char[] input = name.toCharArray();
        for (int i = input.length - 1; i >= 0; i--) {
            System.out.print(input[i] );
        }
    }

    //Reverse number
    public static void reverseNumber() {
        int number = 987654, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("\n" +"The reverse of the given number is: " + reverse);
    }

    public static void main(String args[]) {
        Reverse.reverseString();
        Reverse.reverseNumber();
    }

}
