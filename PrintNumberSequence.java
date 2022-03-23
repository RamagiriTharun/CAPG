package com.capgemini.packg;

public class PrintNumberSequence implements Runnable{
    public int num_upto = 10;
    static int number = 1;
    int remainder;
    static  Object obj = new Object();

    PrintNumberSequence(int remainder){
        this.remainder = remainder;
    }
    @Override
    public void run() {
        while (number <= num_upto) {
            synchronized (obj){
                while(number % 2 != remainder){
                    try{
                        obj.wait();
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+number);
                number++;
                obj.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumberSequence t1 = new PrintNumberSequence(1);
        PrintNumberSequence t2 = new PrintNumberSequence(0);
        Thread t11 = new Thread(t1,"T1");
        Thread t22 = new Thread(t2,"T2");
        t11.start();
        t22.start();
    }
}
