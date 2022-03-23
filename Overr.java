package com.capgemini.packg;

public class Overr {
    public void add(){
        System.out.println("empty");
    }
    public void add(int a){
        System.out.println(a);
    }
    public int add(int a,int b){
        System.out.println("value:"+ (a+b));
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overr obj = new Overr();
        obj.add();
        obj.add(10);
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        int r = obj.add(10,20,30);
        System.out.println(r);
    }
}
