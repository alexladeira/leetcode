package io.cachola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void testEmptyString() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("");
        assertTrue(result);
    }

    @Test
    public void testSingleCharacter() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("a");
        assertTrue(result);
    }

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("abba");
        assertTrue(result);
    }

    @Test
    public void testNonPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("ab_ca");
        assertFalse(result);
    }

}