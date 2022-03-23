package com.capgemini.packg;

public class Student1 implements Comparable<Student1> {
    int rollno;
    int age;
    String name;

    public Student1(int rollno, int age, String name) {
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
    public int compareTo(Student1 o) {
        if(age == o.age){
            return 0;
        }
        else if(age > o.age){
            return 1;
        }
        else{
            return -1;
        }
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
