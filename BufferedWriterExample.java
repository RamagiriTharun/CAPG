package com.capgemini.packg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        File file = new File("out1.txt");
        FileWriter writer = new FileWriter(file);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java world.");
        buffer.close();
        System.out.println("Success");
    }

}
