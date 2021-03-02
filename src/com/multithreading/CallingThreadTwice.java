package com.multithreading;

public class CallingThreadTwice extends Thread{
    public void run(){
        System.out.println("thread1");
    }
    public static void main(String args[]){
        CallingThreadTwice t=new CallingThreadTwice();
        t.start(); //O/p: thread1
        t.start(); //Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
