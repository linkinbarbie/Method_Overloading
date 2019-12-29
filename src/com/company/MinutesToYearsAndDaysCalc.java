package com.company;

//breaks downs minutes to years and days

public class MinutesToYearsAndDaysCalc {
    public static void main(String[] args) {
     printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {

            long years = minutes / (60 * 24 * 365);
            long day = (minutes % (60 * 24 * 365))/(60 * 24);

            System.out.println(minutes + " min = " +  years + " y " + "and " + day + " d " );
        }
    }

}