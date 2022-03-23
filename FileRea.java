package com.capgemini.packg;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRea {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        try {
            java.io.FileReader fr = new java.io.FileReader("output1.txt");
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            fr.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
