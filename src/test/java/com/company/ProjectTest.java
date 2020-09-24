package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjectTest {
    @Test
    public void testConsonants() {
        System.out.println("-------------***************-------------***************----------------------");
        System.out.println("#Testing 'countConsonants' method from 'Consonants' class:");
        int answer = Consonants.countConsonants("My name is Karan");
        assertEquals(8, answer);
        System.out.println("[Input] 'My name is Karan'");
        System.out.println("[Output] " + answer);
        System.out.println("[Expected] 8");
        System.out.println("[Result] PASSED");
    }

    @Test
    public void testLastLetterCount() {
        System.out.println("-------------***************-------------***************----------------------");
        System.out.println("#Testing 'getLastLetterCount' method from 'LastLetterCount' class:");
        String answer = LastLetterCount.getLastLetterCount("Roman numbers have nothing to do with Italy Perfects");
        assertEquals("Words ending in s: 2 & Words ending in y: 1", answer);
        System.out.println("[Input] 'Roman numbers have nothing to do with Italy Perfects'");
        System.out.println("[Expected] Words ending in s: 2 & Words ending in y: 1");
        System.out.println("[Output] " + answer);
        System.out.println("[Result] PASSED");
    }

    @Test
    public void testPalindrome() {
        System.out.println("-------------***************-------------***************----------------------");
        System.out.println("#Testing 'isPalindrome' method from 'Palindrome' class:");
        boolean answer = Palindrome.isPalindrome("Malayalam");
        assertEquals(true, answer);
        System.out.println("[Input] 'Malayalam'");
        System.out.println("[Expected] true");
        System.out.println("[Output] " + answer);
        System.out.println("[Result] PASSED");
    }

    @Test
    public void testVowels() {
        System.out.println("-------------***************-------------***************----------------------");
        System.out.println("#Testing 'countVowels' method from 'Vowels' class:");
        int answer = Vowels.countVowels("My name is Karan");
        assertEquals(5, answer);
        System.out.println("[Input] 'My name is Karan'");
        System.out.println("[Expected] 5");
        System.out.println("[Output] " + answer);
        System.out.println("[Result] PASSED");
    }

    @Test
    public void testWords() {
        System.out.println("-------------***************-------------***************----------------------");
        System.out.println("#Testing 'countWords' method from 'Words' class:");
        int answer = Words.countWords("Java is a fun programming language.");
        assertEquals(6, answer);
        System.out.println("[Input] 'Java is a fun programming language.'");
        System.out.println("[Expected] 6");
        System.out.println("[Output] " + answer);
        System.out.println("[Result] PASSED");
    }
}
