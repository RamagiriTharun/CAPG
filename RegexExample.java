package com.capgemini.packg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // 1 way
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        // 2 way
        boolean b1 = Pattern.compile(".s").matcher("as").matches();
        // 3 way
        boolean b3 = Pattern.matches(".s","as");

        System.out.println(b +" "+ b1 +" "+b3);
        System.out.println("? Quantifier");
        System.out.println(Pattern.matches("[amn]?","a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", ""));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", "annz"));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", "annmmmmmmm"));//true (a or m or n may come zero or more times)

        System.out.println("===================length pattern===============");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
    }
}
