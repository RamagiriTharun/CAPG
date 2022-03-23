package com.capgemini.packg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//write a program to find u r age in no. of year, no. of month, no. of days

public class Example2  {
    int x = 100;
    static int y =200;

    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1.sr"));
        Example2 e = new Example2();
        oos.writeObject(e);
        e.x = 500;
        e.y = 400;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1.sr"));
        Example2 obj = (Example2) ois.readObject();
        System.out.println(obj.x);
        System.out.println(obj.y);

    }
}
