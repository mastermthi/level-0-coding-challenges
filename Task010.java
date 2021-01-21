package com.masanganet.tasks;

import java.util.Locale;

public class Task010 {
    public static void main(String[] args) {
        commonCharacters("joe","bOjo");
    }

    private static void commonCharacters(String input1, String input2) {
       String commonChars ="";
        for (char c:input1.toLowerCase().toCharArray())
        {
           if(input2.toLowerCase().contains("" +c)){
               if (commonChars.contains("" +c)){

               }else {
                   if (commonChars ==""){
                       commonChars += c;
                   }else {
                       commonChars += "," +c;
                   }

               }
           }
        }

        System.out.println("Common letters: "  +commonChars);
    }
}
