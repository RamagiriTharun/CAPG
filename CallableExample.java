package com.capgemini.packg;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ArrayList<Future<Integer>> future1 = new ArrayList<Future<Integer>>();
        for(int i=0;i<10;i++) {
            // Future<Integer> future = executorService.submit(new Task())
            future1.add(executorService.submit(new Task1()));
//            int a = future1.get();
//            System.out.println(a);
        }
        for(Future<Integer> f: future1){
        int a = f.get();
            System.out.println(a);
        }
        executorService.shutdown();
    }
}
class Task1 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread());
        return 5;
    }
}
