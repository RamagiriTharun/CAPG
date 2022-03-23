package com.capgemini.packg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList1 {
    static void StudentList(){
        List<Student1> li = new ArrayList<Student1>();
        li.add(new Student1(3,22,"Tarun"));
        li.add(new Student1(2,34,"Kiran"));
        li.add(new Student1(1,12,"Dinesh"));
        Collections.sort(li);
        for(Student1 s:li){
            System.out.println(s);
        }
    }
    static void StudentSortList() {
        List<Student2> li = new ArrayList<Student2>();
        li.add(new Student2(3, 23, "Harshada"));
        li.add(new Student2(2, 17, "Teju"));
        li.add(new Student2(1, 20, "Daksh"));
        System.out.println("===============sort on Name ===============");
        Collections.sort(li, new NameComparator());
        for (Student2 st : li) {
            System.out.println(st);
        }
        System.out.println("===============sort on Age ===============");
        Collections.sort(li, new AgeComparator());
        for (Student2 st : li) {
            System.out.println(st);
        }
        System.out.println("==========sort on roll no=======");
        Collections.sort(li,new RollComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
    }
        public static void main(String[] args) {
        StudentList();
        StudentSortList();
    }
}
