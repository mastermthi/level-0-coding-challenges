package com.masanganet.tasks;

public class Task08 {
    public static void main(String[] args) {
         toHoursAndMinutes(12);
    }

    private static void toHoursAndMinutes(int number) {


        int hour = number / 60;
        int minute = number % 60;


        if (hour == 1 && minute == 1 ){
            System.out.println(hour +" hour and " +minute +" minute");
        }else
        if(hour > 1 && minute >1) {
            System.out.println(hour + " hours and " + minute + " minutes");
        }else if (minute > 1 && !(hour >1)){
            System.out.println(hour +" hour and " +minute +" minutes");
        }else if(hour > 1 && !(minute >1)){
            System.out.println(hour +" hours and " +minute +" minute");
        }

    }
}
