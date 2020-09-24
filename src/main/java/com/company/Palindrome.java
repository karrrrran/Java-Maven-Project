package com.company;

public class Palindrome {
    public static boolean isPalindrome(String pal){
        //int check = 0;
        int i = 0, j = pal.length()-1;

        pal = pal.toLowerCase();

        while(i < j){
            if(pal.charAt(i) != pal.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
