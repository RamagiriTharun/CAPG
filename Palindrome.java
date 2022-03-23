package com.capgemini.packg;

import java.util.Scanner;

public class Palindrome {
    static void palindromeSubString(String s){
        int count = 0;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++) {
                String res = s.substring(j, j + i);
                String rev = "";
                for (int k = res.length() - 1; k >= 0; k--) {
                    rev = rev + res.charAt(k);
                }
                if (res.equals(rev)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sting: ");
        String s = sc.nextLine();
        palindromeSubString(s);
    }
}
