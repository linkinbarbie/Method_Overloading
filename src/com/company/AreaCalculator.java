package com.company;
//this class uses method overloading to calculate rectangle area and circle area
public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(9d,4d));
        System.out.println(area(5d));

    }

    public static double area(double radius) {
        if (radius < 0d) {
            return -1.0d;
        } else {
            return radius * radius * Math.PI;



        }
    }

    public static double area(double x, double y) {
        if (x < 0d || y < 0d) {
            return -1.0d;
        } else {
            return x * y;

        }

    }
}



