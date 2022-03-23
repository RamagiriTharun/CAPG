package com.capgemini.packg;

public class Function {
    public void m1(){
        System.out.println("from function");
    }
    public void m2(){
        System.out.println("new form function");
    }
    public void m3(String name){
        System.out.println("from parameterized function : " + name);
    }
    public void m4(int age){
        System.out.println("Age = " + age);
    }
    public void m5(float salary){
        System.out.println("Your Salary = "+ salary);
    }
    public void m6(String name,int age){
        System.out.println("my name is "+name+" and age is "+age);
    }
    public int m7(int a,int b){
        int result;
        return a+b;
    }

    public static void main(String[] args) {
        Function o = new Function();
        o.m1();
        o.m2();
        o.m3("Java");
        o.m4(18);
        o.m5(45000.00f);
        o.m6("kiran",16);
        System.out.println(o.m7(3,5));
        System.out.println("after function");
    }
}
