package com.capgemini.packg;

import java.util.*;

//duplicates elements can't be added to the set
//tree set maintains the sorting order by default it is ascending order.
public class SetExample {
    static void SetMethod(){
        Set<String> set = new HashSet<String>();
        set.add("Tharun");
        set.add("Kiran");
        set.add("Dinesh");
        System.out.println("====Hashed Set=====");
        for(String s:set){
            System.out.println(s);
        }
//        Iterator is an interface can be used to iterate the elements.
//        Iterator<String> it = set.iterator();
//        while(it.hasNext()){ //has next is a method that can be used to check whether there r more elements
//            String s = it.next(); // next method is used to get the next elements.
//            System.out.println(s);
//        }
    }
    // Iterator syntax
    // Iterator<Genric> iterator_name = obj.iterator();
    // stored in red black tree structure
    static void TreeSetMethod(){
        Set<String> set = new TreeSet<String>();
        set.add("Tharun");
        set.add("Dinesh");
        set.add("Kiran");
        System.out.println("======Tree Set ======");
        for(String s:set){
            System.out.println(s);
        }
    }
    // insertion order is maintained in this
    static void LinkedSetMethod(){
        Set<String> set = new LinkedHashSet<String>();
        set.add("Tharun");
        set.add("Kiran");
        set.add("Dinesh");
        System.out.println("=====Linked Hash Set======");
        for(String s:set){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        SetMethod();
        TreeSetMethod();
        LinkedSetMethod();
    }
}
