package com.masanganet.tasks;

public class Task05 {
    public static void main(String[] args) {

        double area = calculateArea(24,30,18);
        System.out.println(area);
    }

    private static double calculateArea(int a, int b, int c) {

        double p = halfPerimeter(a,b,c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double halfPerimeter(int a, int b, int c) {
        return ( (a + b + c) / 2 );
    }

}
