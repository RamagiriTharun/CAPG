package com.capgemini.packg;
// we can break and continue for inner and outer loops using labels.
public class BreakEx {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i == 2 & j == 2){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
//        swapping of two variables without using 3 variable.
//        int a = 5;
//        int b = 3;
//        System.out.println(a+" "+b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a + " " + b);
    }
}
