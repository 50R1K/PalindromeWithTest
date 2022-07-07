package com.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        String testStr1 = "Dad";
        String testStr2 = "                       KAzAk    ";
        String testStr3 = "LOL";
        String testStr4 = "saippuakivikauppias";
        String testStr5 = "topot";
        String testStr6 = "KE K";
        String testStr7 = "Aunt";
        String testStr8 = "California";
        assertTrue(Palindrome.isPalindrome(testStr1));
        assertTrue(Palindrome.isPalindrome(testStr2));
        assertTrue(Palindrome.isPalindrome(testStr3));
        assertTrue(Palindrome.isPalindrome(testStr4));
        assertTrue(Palindrome.isPalindrome(testStr5));
        assertFalse(Palindrome.isPalindrome(testStr6));
        assertFalse(Palindrome.isPalindrome(testStr7));
        assertFalse(Palindrome.isPalindrome(testStr8));
    }
}