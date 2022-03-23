package com.capgemini.packg;

import java.util.Scanner;

public class Account1 {
    private double balance = 10000.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double amnt) throws BankException {
        if(amnt > balance) {
            throw new BankException("Ins");
        }
        else{
            balance = balance - amnt;
            System.out.println("amount withdrawn is:" + amnt);
        }
    }

    public static void main(String[] args) {
        Account1 obj = new Account1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        double amnt = sc.nextDouble();
        try {
            obj.withdraw(amnt);
        } catch (BankException e) {
            e.printStackTrace();
            System.out.println("Insufficient Balance");
            System.out.println("amount withdrawn is: 0.0");
        }
        System.out.println("Balance is:" + obj.getBalance());
    }
}
