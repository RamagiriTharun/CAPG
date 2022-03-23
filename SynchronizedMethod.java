package com.capgemini.packg;

public class SynchronizedMethod {
    // it makes sure that only a particular thread can access the resource for the amount of time
    // synchronized block is better than synchronized method
    /*synchronized */void printTable(int n){ // synchronized method
         synchronized(this) { // synchronized block
             for (int i = 1; i <= 5; i++) {
                 System.out.println(n * i);
                 try {
                     Thread.sleep(400);
                 } catch (Exception e) {
                     System.out.println(e);
                 }
             }
         }
    }
    public static void main(String[] args) {
        SynchronizedMethod obj = new SynchronizedMethod();
        Thread t1 = new Thread(()-> obj.printTable(5));
        Thread t2 = new Thread(()-> obj.printTable(100));
        t1.start();
        t2.start();
    }
}
