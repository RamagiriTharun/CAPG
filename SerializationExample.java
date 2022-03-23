package com.capgemini.packg;

import javax.imageio.IIOException;
import java.io.*;

public class SerializationExample implements Serializable {
    int i;
    String name;

    SerializationExample(int i,String name){
        this.i = i;
        this.name = name;
    }
}
class Test1{
    public static void main(String[] args) {
        SerializationExample obj = new SerializationExample(1, "tharun");
        String filename = "file.ser";
        //serialization
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            System.out.println("IOException is caught");
        }
        SerializationExample obj1 = null;
        //deserialization
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            obj1 = (SerializationExample) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            System.out.println("a = " + obj1.i);
            System.out.println("name = " + obj1.name);
        } catch (IOException e) {
            System.out.println("IOException caught");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception is caught");
        }
    }
}