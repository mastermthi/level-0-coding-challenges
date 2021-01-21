package com.masanganet.tasks;

public class Task04 {

    public static void main(String[] args) {
      evenOrOdd(3);
    }

    private static void evenOrOdd(int number) {
        if (number % 2 == 0)
        {
            System.out.println("even");

        }else
            {
                System.out.println("odd");
        }
    }

}
