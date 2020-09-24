package com.company;

public class Consonants {
    public static int countConsonants(String word){
        word = word.toLowerCase().trim();
        //char c[] = word.toCharArray();
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u' && word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                word = word.substring(0, i) + "*" + word.substring(i + 1);
                count++;
            }
        }
        System.out.println(word);
        return count;
    }
}
