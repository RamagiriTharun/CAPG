package com.capgemini.packg;

import java.util.Comparator;

public class Student2 {
    int rollno;
    int age;
    String name;

    public Student2(int rollno, int age, String name) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollno=" + rollno +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class AgeComparator implements Comparator<Student2>{
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.age == o2.age){
            return 0;
        }
        else if(o1.age > o2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class NameComparator implements Comparator<Student2>{
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.name.compareTo(o2.name);
    }
}
class RollComparator implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.rollno > o2.rollno){
            return 1;
        }
        else if(o1.rollno < o2.rollno){
            return 0;
        }
        else{
            return -1;
        }
    }
}
