//package com.capgemini.packg;
//
//// Anonymous class: without class name
//// anotation functional interface is used to specify the single method inside the interface not more than that.
//// if given an error is raised. It is used to specify that others cannot add the methods into the interface.
////@FunctionalInterface
//interface Abc{
//    void m1();
////    void m2();
////    void m1(int i);
//}
//public class Example {
//    public static void main(String[] args) {
//        Abc l = new Abc() {
//            public void m1() {
//                System.out.println("from m1 method");
//            }
//        };
//        l.m1();
//
//        Abc l2 = new Abc(){
//            public void m1(){
//                System.out.println("form m2");
//            }
//        };
//        l2.m1();
//// creating anonymous class and writing methods without name
////        Abc l3 = y->{
////                System.out.println("form method  "+y);
////            };
////        l3.m1(2);//indirectly it is pointed to m1() method if we don't specify the method name
////    }
//}
