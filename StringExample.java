package com.capgemini.packg;

import java.util.StringTokenizer;

public class StringExample {
    static void stringTokenizerMethod(){
        StringTokenizer st = new StringTokenizer("Hello welcome to java programming learning session"," ");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
    // thread safety & synchronized
    // it is mutable
    static void stringBufferMethod(){
        StringBuffer st = new StringBuffer("Hello");
        st.append(" 1");
        System.out.println(st);
        st.insert( 5, " Harshada");
        System.out.println(st);
        st.replace(1,3, "teju");
        System.out.println(st);
        st.delete(1,5);
        System.out.println(st);
        System.out.println(st.reverse());
    }
    // it is mutable
    //no thread safety multiple threads can be accessed simultaneously
    static void stringBuilderMethod(){
        StringBuilder st = new StringBuilder("Hello");
        st.append(" 1");
        System.out.println(st);
        st.insert( 5, " Harshada");
        System.out.println(st);
        st.replace(1,3, "teju");
        System.out.println(st);
        st.delete(1,5);
        System.out.println(st);
        System.out.println(st.reverse());
    }
    // it is not mutable
    static void stringMethod(){
        String name = "hello";
        System.out.println(name.charAt(3));
        String s1 = "hello";
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equalsIgnoreCase("Hello"));
        String s3 = s1.concat("4");
        System.out.println("s3 = " + s3);
        System.out.println("s1 = " + s1);
        System.out.println(s1.concat("2"));
        System.out.println(s1);
        System.out.println(s1.contains("he"));
        System.out.println(s1.endsWith("lo"));
        String s5 = String.format("Hello %s, Welcome","Harshada");
    }
    public static void main(String[] args) {
//        stringMethod();
//        stringBufferMethod();
//        stringBuilderMethod();
        stringTokenizerMethod();
    }
}
