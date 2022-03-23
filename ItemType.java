package com.capgemini.packg;
import java.util.Scanner;
public class ItemType {
    private String name;
    private double costPerDay;
    private double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public void display(String name,double costPerDay,double deposit){
        System.out.println("name = " + name);
        System.out.println("costPerDay = " + String.format("%.2f",costPerDay));
        System.out.println("deposit = " + String.format("%.2f",deposit));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemType obj = new ItemType();
        System.out.println("Enter the service name:");
        obj.setName(sc.nextLine());
        System.out.println("Enter the costperday:");
        obj.setCostPerDay(sc.nextDouble());
        System.out.println("Enter the deposit:");
        obj.setDeposit(sc.nextDouble());
        obj.display(obj.getName(),obj.getCostPerDay(),obj.getDeposit());
    }
}
