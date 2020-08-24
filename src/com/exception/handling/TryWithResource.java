package com.exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    //try with resource new in JDK 1.7 without catch can use only try block
    public void tryResource() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter a and b value : ");
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int c=a/b;
            System.out.println("divide : "+c);
        }
    }
    public static void main(String arf[]) throws IOException {
        TryWithResource tryWithResource= new TryWithResource();
        tryWithResource.tryResource();
        }
}
