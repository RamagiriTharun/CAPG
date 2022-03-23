package com.capgemini.packg;

import java.util.*;

public class MapExample {
    static void mapMethod() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "Kiran");
        map.put(3, "Tharun");
        map.put(5, "Dinesh");
        map.put(3, "Mahesh");//existing key is used then value is replaced
        //iterating using entryset
        System.out.println("=========Entry Set============");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        //iterating using keyset
        System.out.println("=========Key Set======");
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
        //using iterator
        System.out.println("=====entry set Iterator=======");
        Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("===============By using Keyset Iterator===============");
        Iterator<Integer> itrInt = keySet.iterator();
        while (itrInt.hasNext()) {
            Integer key = itrInt.next();
            System.out.println(key + "   " + map.get(key));
        }
        System.out.println("================By using for each===============");
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
        static void TreeMap(){
            TreeMap<Student2, String> map = new TreeMap<Student2, String>(new NameComparator());
            map.put(new Student2(3,23,"Harshada"),"abc");
            map.put(new Student2(2,34,"Daksh"),"pqr");
            map.put(new Student2(1,3,"Teju"),"dfgf");
            System.out.println("================By using for each===============");
            map.forEach((k,v)-> System.out.println(k +" "+v));
        }
        static void TreeAgeMap(){
            java.util.TreeMap<Student2, String> map = new TreeMap<Student2, String>(new AgeComparator());
            map.put(new Student2(3,23,"Harshada"),"abc");
            map.put(new Student2(2,34,"Daksh"),"pqr");
            map.put(new Student2(1,3,"Teju"),"dfgf");
            System.out.println("================By using for each===============");
            map.forEach((k,v)-> System.out.println(k +" "+v));
        }
    public static void main(String[] args) {
        mapMethod();
        TreeMap();
        TreeAgeMap();
    }
}
