package com.capgemini.packg;

import java.util.Scanner;

public class Personn {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}

class Donor extends Personn{
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public void displayDonationDetails(){
        System.out.println("Donation Details :");
        System.out.println("Name : " + getName());
        System.out.println("Date Of Birth : " + getDateOfBirth());
        System.out.println("Gender : " + getGender());
        System.out.println("Mobile Number : " + getMobileNumber());
        System.out.println("Blood Group : " + getBloodGroup());
        System.out.println("Blood Bank Name : " + getBloodBankName());
        System.out.println("Donor Type : " + getDonorType());
        System.out.println("Donation Date : " + getDonationDate());
    }

    public static void main(String[] args) {
        Donor obj = new Donor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        obj.setName(sc.nextLine());
        System.out.println("Enter DateOfBirth:");
        obj.setDateOfBirth(sc.nextLine());
        System.out.println("Enter Gender:");
        obj.setGender(sc.nextLine());
        System.out.println("Enter Mobile number:");
        obj.setMobileNumber(sc.nextLine());
        System.out.println("Enter Blood Group:");
        obj.setBloodGroup(sc.nextLine());
        System.out.println("Enter Blood Bank Name:");
        obj.setBloodBankName(sc.nextLine());
        System.out.println("Enter Donor Type:");
        obj.setDonorType(sc.nextLine());
        System.out.println("Enter Donation Date:");
        obj.setDonationDate(sc.nextLine());

        obj.displayDonationDetails();
    }
}
