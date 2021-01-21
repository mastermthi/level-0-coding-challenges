package com.masanganet.tasks;

public class Task07 {
    public static void main(String[] args) {
        double fahrenheit = celsiusToFahrenheit(36.0);
        double celsius = fahrenheitToCelsius(36.0);

        System.out.println(fahrenheit);
        System.out.println(celsius);

    }

    private static double fahrenheitToCelsius(double fahrenheit) {
       return ( (fahrenheit - 32) * 0.5555555555555556);
    }

    private static double celsiusToFahrenheit(double celsius) {
             return ( (celsius * 1.8000) + 32.00);
    }
}
