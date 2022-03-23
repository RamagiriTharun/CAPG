package com.capgemini.packg;

import java.io.IOException;

public class ExceptionExample {
    void m3(){
        m1(5,0);
        System.out.println("in m3");
    }
    void m1(int a,int b){
        try {
            int res = a / b;//Exception is raised as we are dividing by zero to handle we using try and catch
            System.out.println(res);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("in m1");
    }
    void m2()throws IOException{
        throw new  IOException();//We always throw object as exception so we used new
    }
    void m4(String s){
        System.out.println(s.equals("hi"));
    }
    public static void main(String[] args){
        ExceptionExample obj = new ExceptionExample();
       // obj.m1(3,0);
//        try {
//            obj.m2();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        obj.m3();
        try {
            obj.m2();
            obj.m4(null);
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("from runtime");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("From io exception");
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("after try");
        }
    }
}
// try must have a finally or catch block or both but can't be written without them.
// finally block always get executed
// we can have multiple catch blocks for single try
// try checks for nearest catch block if exception matches it executes.

