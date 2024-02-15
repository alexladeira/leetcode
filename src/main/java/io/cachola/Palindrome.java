package io.cachola;

public class Palindrome {
    public boolean isPalindrome(String s) {
        String original = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]+", "");
        if (original.isEmpty()) {
            return true;
        }

        return original.contentEquals(new StringBuilder(original).reverse());
    }
}
