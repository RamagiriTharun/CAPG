package com.capgemini.packg;

public class Account {
    private String name;
    private String acc_num;
    private String tran_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }

    public String getTran_type() {
        return tran_type;
    }

    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tharun");
        obj.setAcc_num("123456789");
        obj.setTran_type("Debit");

        Account obj2 = new Account();
        obj2.setName("kiran");
        obj2.setAcc_num("987654321");
        obj2.setTran_type("Credit");

        /*System.out.println(obj.name);
        System.out.println(obj.acc_num);
        System.out.println(obj.tran_type);*/

        System.out.println("Name = " + obj.getName());
        System.out.println("Account number =" + obj.getAcc_num());
        System.out.println("Transaction type = " + obj.getTran_type());

        System.out.println("********************");

        System.out.println("Name = " + obj2.getName());
        System.out.println("Account number =" + obj2.getAcc_num());
        System.out.println("Transaction type =" + obj2.getTran_type());
    }
}
