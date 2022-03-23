package com.capgemini.packg;

public class JoinMethod extends Thread {
    JoinMethod(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(i +" "+Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        JoinMethod t1 = new JoinMethod("t1");
        JoinMethod t2 = new JoinMethod("t2");
        JoinMethod t3 = new JoinMethod("t3");
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
