package com.capgemini.packg;
//object class is parent class of all the objects
//every constructor has inbuilt super() in first line and this and super should be the first line of the constructor body
// for parameterized constructor we need to pass parameter in super to call the parent cls constructor
class Parent{
    Parent(int a){
        System.out.println("parent");
    }
    int id;
    public int getId(){
        return id;
    }
    void m1(){
        System.out.println("from parent");
    }
}
public class InheritanceEx extends Parent {
    InheritanceEx(){
        this(4);
        System.out.println("child class");
    }
    InheritanceEx(int a){
        super(5);
        System.out.println("another child constructor");
    }
    void m1(){
        System.out.println("from child");
    }
    void m2(){
        System.out.println("from m2 child");
    }
    public static void main(String[] args) {
        InheritanceEx con = new InheritanceEx();
//        Parent p = new Parent();
//        InheritanceEx o = new InheritanceEx();
//        Parent p1 = new InheritanceEx(); // parent reference assigned with child obj possible
////        InheritanceEx o1 = new Parent(); cannot be written because child reference cannot have parent.
//        o.id = 40;
//        o.getId();
//        p.id = 10;
//        System.out.println(p.getId());
//        p.m1();
//        o.m1();
//        o.m2();
//        p1.m1();
////        p.m2(); cannot be taken as m2 not there in parent
////        p1.m2(); -------------------> cannot be done because of parent doesnt have m2
    }
}
