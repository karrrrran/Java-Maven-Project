package com.company;

public class Vowels {
    public static int countVowels(String word){
        word.toLowerCase();
        int count = 0;

        for(char c : word.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        return count;
    }
}
