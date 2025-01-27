package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("hello"));
    }

    public static boolean checkForPalindrome(String input){
      String cleanedInput="";
      for(int i=0;i<input.length();i++){
          char c=input.charAt(i);
          if(Character.isLetterOrDigit(c)){
              cleanedInput += Character.toLowerCase(c);
          }
  }
      String reversedInput="";
      for(int i=cleanedInput.length()-1;i>=0;i--){
          reversedInput += cleanedInput.charAt(i);
      }

      return cleanedInput.equals(reversedInput);
    }

    public  static String convertDecimalToBinary(int number) {

        List<Integer> kalanlar=new ArrayList<>();

       while (number>0){
           int kalan=number%2;
           kalanlar.add(kalan);
           number=number/2;
       }

        Collections.reverse(kalanlar);


        StringBuilder binary=new StringBuilder();
        for (int bit: kalanlar) {
            binary.append(bit);
        }
         return binary.toString();
    }

}