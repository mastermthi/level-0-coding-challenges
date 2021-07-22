package com.masanganet.tasks;

public class Task08 {
    public static void main(String[] args) {
         toHoursAndMinutes(1);
    }

    private static void toHoursAndMinutes(int number) {
        int hour = number / 60;
        int minute = number % 60;

        if(hour == 0 && minute ==0){
            System.out.println(hour +" hours, " +minute +" minutes");
        }else
        if (hour == 1 && minute == 1 ){
            System.out.println(hour +" hour, " +minute +" minute");
        }else
        if(hour > 1 && minute >1) {
            System.out.println(hour + " hours, " + minute + " minutes");
        }else if (minute > 1 && hour ==1){
            System.out.println(hour +" hour, " +minute +" minutes");
        }else if(hour > 1 && minute ==1){
            System.out.println(hour +" hours, " +minute +" minute");
        }else if(hour == 1 && minute ==0){
            System.out.println(hour +" hour, " +minute +" minutes");
        }
        else if(hour == 0 && minute ==1){
            System.out.println(hour +" hours, " +minute +" minute");
        }
    }
}
