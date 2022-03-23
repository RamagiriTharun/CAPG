package com.capgemini.packg;

import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n =sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Thread even = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Even numbers are:");
                for(int i = 0;i<n;i++){
                    if(a[i] % 2 == 0){
                        System.out.println(a[i]);
                    }
                }
            }
        });

        Thread odd = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Odd numbers are:");
                for(int i=0;i<n;i++){
                    if(a[i] % 2 != 0){
                        System.out.println(a[i]);
                    }
                }
            }
        });
        even.start();
        odd.start();
    }
}
