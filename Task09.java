package com.masanganet.tasks;

public class Task09 {
    public static void main(String[] args) {
          vowels("Umuzi");
    }

    private static void vowels(String input) {
        String vowels ="";
        for (char c: input.toLowerCase().toCharArray())
        {
           if(c =='a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
               if(vowels.isEmpty()){
                  if(!vowels.contains(c + ""))
                   vowels += c;
               }else{
                   if(!vowels.contains(c+""))
                       vowels += ", " + c;
               }
           }
        }
        System.out.println("Vowels: "+ vowels+".");
    }
}
