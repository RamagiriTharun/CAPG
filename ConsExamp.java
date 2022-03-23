package com.capgemini.packg;

enum Color{
    RED("red"),
    GREEN("green"),
    BLUE;
    String name;

    private Color(){
    }
    private Color(String name){
        this.name = name;
        System.out.println("constructor");
    }
    void m1(){
        System.out.println("from m1 method");
    }
}
public class ConsExamp {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1+" "+c1.ordinal()+" "+c1.name);

        Color c2 = Color.GREEN;
        System.out.println(c2+" "+c2.ordinal()+" "+c2.name);

    }
}
