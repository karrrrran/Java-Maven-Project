package com.company;

public class Words {
    public static int countWords(String word){
        String[] words = word.split("\\s+");
        return words.length;
    }
}
