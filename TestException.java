package com.capgemini.packg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class TestException{
    void m1() throws MyException{
        throw new MyException();
    }
    static int i;
    static int j;
    public static void main(String[] args) {

        TestException a = new TestException();
        TestException b = new TestException();
        a.i = 2;
        a.j = 3;
        b.i = 5;
        b.j = 6;
        System.out.println(a.i + " "+ a.j + " " +b.i + " "+ b.j);
//        TestException obj = new TestException();
//        obj.m1();//gives no error at compile time due to extend runtime exception
////        try {
////            obj.m1();//should give in try & catch as extends compile time exception
////        } catch (MyException e) {
////            e.printStackTrace();
////        }
//        System.out.println("after handling exception");
    }
}
