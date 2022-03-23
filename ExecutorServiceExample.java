package com.capgemini.packg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0;i<15;i++){
            executorService.execute(new Task());
        }
//        for(int i =0 ;i<15;i++){
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread());
//                }
//            });
//        }
        executorService.shutdown();
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Executor Service: " +Thread.currentThread());
    }
}