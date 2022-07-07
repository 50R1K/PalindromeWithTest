package com.Palindrome;

public class Palindrome {
    public static boolean isPalindrome(String fWord){
        StringBuilder fWordReversed = new StringBuilder();
        StringBuilder fWordStandart = new StringBuilder();
        fWordStandart.append(fWord.trim().toLowerCase());
        fWordReversed.append(fWord.trim().toLowerCase());
        fWordReversed.reverse();
        return fWordStandart.toString().equals(fWordReversed.toString());
    }
}