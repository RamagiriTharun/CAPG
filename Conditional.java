package com.capgemini.packg;

public class Conditional {
    public void forLoop(){
        System.out.println("===============================for========================");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public void whileLoop(){
        int i = 0;
        System.out.println("==============================while============================");
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    public void doWhileLoop(){
        int i = 0;
        System.out.println("==================do while ===============================");
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }
    public static void main(String[] args) {
        Conditional o = new Conditional();
        //o.forLoop();
        //o.doWhileLoop();
        //o.whileLoop();
       /* for(int i=0;i<=5;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        int i = 0;
        while(i< 5){
            int j = 0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
