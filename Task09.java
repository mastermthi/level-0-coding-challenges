package com.masanganet.tasks;

import java.util.Locale;

public class Task09 {
    public static void main(String[] args) {
          vowels("ThApelo");
    }

    private static void vowels(String input) {
        String vowels ="";
        for (char c: input.toLowerCase().toCharArray())
        {
           if(c =='a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
               vowels += c;
           }
        }

        System.out.println(vowels);
    }
}
