package com.capgemini.packg;

public class ThreadSleepMethod {
    public static void main(String[] args) {
        try{
            for(int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
