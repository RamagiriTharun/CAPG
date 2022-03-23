package com.capgemini.packg;

public class YieldMethod extends Thread {
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName() +" in control");
        }
    }

    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod();
        YieldMethod t2 = new YieldMethod();
        t1.setName("first thread");
        t2.setName("second thread");
//        t2.setPriority(MAX_PRIORITY);
//        t1.setPriority(MIN_PRIORITY);
        t1.start();
        t2.start();
        for(int i=0;i<3;i++){
            // control passes to the other thread
            //t1.yield();
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
}