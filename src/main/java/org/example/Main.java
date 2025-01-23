package org.example;


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

}