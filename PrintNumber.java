package com.capgemini.packg;

import static com.capgemini.packg.PrintNumber.Max_Num;

public class PrintNumber {
    final static int Max_Num = 10;
    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();
        Thread t1 = new Thread(new NumberRunnable(obj,0),"T1");
        Thread t2 = new Thread(new NumberRunnable(obj,1),"T2");
        Thread t3 = new Thread(new NumberRunnable(obj,2),"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class NumberRunnable implements Runnable{
    static int number = 0;
    PrintNumber obj;
    int threadNumber;
    NumberRunnable(PrintNumber obj,int rem){
        this.obj = obj;
        this.threadNumber = rem;
    }
    @Override
    public void run() {
        while(number < Max_Num){
            synchronized (obj){
                if(number % 3 == threadNumber && number < Max_Num){
                    System.out.println(Thread.currentThread().getName()+ " "+ ++number);
                }
            }
        }
    }
}
