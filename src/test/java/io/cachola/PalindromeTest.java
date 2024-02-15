package io.cachola;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testEmptyString() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("");
        Assertions.assertTrue(result);
    }

    @Test
    public void testSingleCharacter() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("a");
        Assertions.assertTrue(result);
    }

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("abba");
        Assertions.assertTrue(result);
    }

    @Test
    public void testNonPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("ab_ca");
        Assertions.assertFalse(result);
    }

}