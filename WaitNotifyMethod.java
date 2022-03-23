package com.capgemini.packg;

public class WaitNotifyMethod {
    volatile boolean done = false;
    synchronized void part1(){
        System.out.println("welcome to india");
        done = true;
        System.out.println("thread 1 about to surrender lock");
        notifyAll();
    }
    synchronized void part2(){
        System.out.println("thread 2 waiting");
        while(!done){
            try{
                wait();
                System.out.println("thread 2 running again");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("visit taj mahal");
    }
    public static void main(String[] args) {
        WaitNotifyMethod obj = new WaitNotifyMethod();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.part1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.part2();
            }
        });
        t2.start();
        t1.start();
    }
}
