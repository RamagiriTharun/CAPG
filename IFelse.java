package com.capgemini.packg;
import java.util.*;

public class IFelse {
    public void large(int x,int y){
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else{
            System.out.println(x+" is smaller than "+y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        IFelse o = new IFelse();
        o.large(x,y);
        /*int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }*/
    }
}
