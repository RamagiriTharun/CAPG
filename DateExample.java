package com.capgemini.packg;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Currency;
import java.util.Date;

public class DateExample {
    static void UtilDate(){
        // instantiate date object
        Date date = new Date();
        // display time and date using toString
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date:"+ft.format(date));
    }
    static void DateMethod(){
        LocalDateTime datetime1 = LocalDateTime.of(2017,1,14,10,34);
        LocalDateTime datetime2 = datetime1.plusDays(120);
        System.out.println("Before Formatting:" + datetime1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
        String formatDateTime = datetime2.format(format);
        System.out.println("After Formatting: " + formatDateTime );
        LocalDateTime datetime3 = datetime1.minusDays(100);
        System.out.println(datetime3);
        System.out.println(datetime1);
        System.out.println(datetime1.get(ChronoField.DAY_OF_WEEK));
        System.out.println(datetime1.get(ChronoField.DAY_OF_YEAR));
        System.out.println(datetime1.get(ChronoField.DAY_OF_MONTH));
        System.out.println(datetime1.get(ChronoField.HOUR_OF_DAY));
        System.out.println(datetime1.get(ChronoField.MINUTE_OF_DAY));

        LocalTime time1 = LocalTime.of(10,43,12);
        System.out.println("time1 = "+time1);
        LocalTime time2=time1.minusHours(2);
        LocalTime time3=time2.minusMinutes(34);
        System.out.println(time3);
        LocalTime time4=time1.plusHours(4);
        LocalTime time5=time4.plusMinutes(18);
        System.out.println(time5);
        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two Time Zone: "+hours);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two time zone: "+minutes);
    }

    static void CurrencyMethod(){
        // Use of getInstance() method to 'AUD' instance
        Currency c1 = Currency.getInstance("AUD"); //Australian Dollar
        Currency c2 = Currency.getInstance("JPY");  //Japan Yen
        Currency c3 = Currency.getInstance("USD");  //USD Dollar
        Currency c4 = Currency.getInstance("INR");

        // Use of getCurrencyCode() method
        String cCode1 = c1.getCurrencyCode();
        String cCode2 = c2.getCurrencyCode();
        System.out.println("Australian Dollar code : " + cCode1);
        System.out.println("Japan Yen code : " + cCode2);
        System.out.println("");
        String cCode3 = c4.getCurrencyCode();
        System.out.println("India code: "+cCode3);

        // Use of getDefaultFractionDigits() method
        int D1 = c1.getDefaultFractionDigits();
        System.out.println("AUD Fraction digits : " + D1);

        int D2 = c2.getDefaultFractionDigits();
        System.out.println("JPY fraction digits : " + D2);
        System.out.println("");
        System.out.println("INR Fraction: "+c4.getDefaultFractionDigits());
        // Use of getDisplayName() method
        System.out.println("AUD Display : "+c1.getDisplayName());
        System.out.println("JPY Display : "+c2.getSymbol());
        System.out.println("INR Display : "+c4.getSymbol());
        System.out.println("");

        // Use of getSymbol() method
        System.out.println("JPY Symbol : "+c1.getSymbol());
        System.out.println("JPY Symbol : "+c2.getSymbol());
        System.out.println("USD Symbol : "+c3.getSymbol());
        System.out.println("INR Symbol : "+ c4.getSymbol());
    }

    public static void main(String[] args) {
//        UtilDate();
//        DateMethod();
        CurrencyMethod();
    }
}
