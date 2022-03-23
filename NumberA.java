package com.capgemini.packg;

import java.util.Scanner;

public class NumberA {
    static String findAverage(int a[]){
        int avg = 0;
        if(a.length == 0){
            System.out.println("Array is empty.");
            return null;
        }
        else {
            for (int b : a) {
                if (b > 0) {
                    avg += b;
                } else {
                    System.out.println("all values are not positive");
                    return null;
                }
            }
        }
        return String.valueOf(avg/a.length);
    }
    static void getArrayValues(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of Values:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int result = 0;
        if(findAverage(a) != null){
            result = Integer.parseInt(findAverage(a));
        }
        System.out.println("Average is: " + result);
    }
    public static void main(String[] args) {
        getArrayValues();
    }
}
