package com.capgemini.packg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadFromScanner {
    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {
        // pass the path to the file as a parameter
        File file = new File("output1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
