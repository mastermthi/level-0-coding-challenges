package com.masanganet.tasks;

public class Task06 {

    public static void main(String[] args) {

        int maximum = maximum(1,22,3,2);
        System.out.println(maximum);
    }


    private static int maximum(int... numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return  max;
    }
}
