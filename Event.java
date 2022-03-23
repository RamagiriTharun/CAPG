package com.capgemini.packg;

import java.util.Scanner;

abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public Event(String name, String detail, String type, String organiser) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    abstract double calculateAmount();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }
}
class Exhibition extends Event{
    private int noOfStalls;
    private double rentPerStall;

    public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall) {
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public double getRentPerStall() {
        return rentPerStall;
    }

    public void setRentPerStall(double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

    public double calculateAmount(){
        return(noOfStalls*rentPerStall);
    }
}

class StageEvent extends Event {
    private int noOfShows;
    private double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow) {
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public double getCostPerShow() {
        return costPerShow;
    }

    public void setCostPerShow(double costPerShow) {
        this.costPerShow = costPerShow;
    }

    public double calculateAmount() {
        return (noOfShows * costPerShow);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Exhibition");
        System.out.println("2.Stage Event");
        int n = sc.nextInt();
        sc.nextLine();
        switch (n){
            case 1 :
                System.out.println("Enter details in the format : [name,detail,type,organiser,no of stalls,rent per stall] ");
                Event e;
                e = new Exhibition(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
                System.out.println("Event name: " + e.getName());
                System.out.println("Detail : " + e.getDetail());
                System.out.println("Type : " + e.getType());
                System.out.println("Organiser : " + e.getOrganiser());
                System.out.println("Total cost: "  +e.calculateAmount());
                break;
            case 2:
                System.out.println("Enter details in the format : [name,detail,type,organiser,no of shows,cost per show] ");
                Event se = new StageEvent(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextDouble());
                System.out.println("Event name: " + se.getName());
                System.out.println("Detail : " + se.getDetail());
                System.out.println("Type : " + se.getType());
                System.out.println("Organiser : " + se.getOrganiser());
                System.out.println("Total Cost: " + se.calculateAmount());
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}