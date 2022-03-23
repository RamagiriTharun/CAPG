package com.capgemini.packg;
// interface contains method with public and abstract keywords by default by compiler.
interface Examp{
    void m1();
    void m2();
//    we can define methods with body using default and static keyword in inheritance.
    default void m3(){
        System.out.println("from m3");
    }
    static void m4(){
        System.out.println("from m4");
    }
}
public class InterfaceEx implements Examp{
    public void m1(){
        System.out.println("from m1 method");
    }
    public void m2(){
        System.out.println("from m2 method");
    }
    public void m5(){
        System.out.println("form m5");
    }

    public static void main(String[] args) {
        Examp obj = new InterfaceEx();
        obj.m1();
        obj.m2();
        obj.m3();
//        obj.m4();  ---cannot be done because it is not overriden and obj is not created so to call it we use class name.
        Examp.m4();
//        obj.m5(); --- it can't be done as we defined the method in this class and the obj is created of this cls with refernece of interface.

    }
}

