package com.capgemini.packg;

public class MultiThread extends Thread {
    MultiThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("this is from run method"+Thread.currentThread());
    }


    public static void main(String[] args) {
        MultiThread t1 = new MultiThread("t1");
        MultiThread t2 = new MultiThread("t2");
//     t1.setName("t1");
//     t2.setName("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        MultiThread t4 = new MultiThread("t4");
        t4.start();
        System.out.println("outside");
    }

}
