package com.capgemini.packg;

public class BankException extends Exception{
    String msg;
    BankException(String msg){
        System.out.println(msg);
    }
}
