package com.capgemini.packg;

import java.io.FileOutputStream;

public class FileOutPutStreamExample {
        public static void main(String[] args) {
            try{

                FileOutputStream fout=new FileOutputStream("testout.txt");
//            fout.write(65);
                String s=" This is new file ";
                byte b[]=s.getBytes();//converting string into byte array
                fout.write(b);
                fout.close();
                System.out.println("success...");
            }catch(Exception e){System.out.println(e);}
        }
}
