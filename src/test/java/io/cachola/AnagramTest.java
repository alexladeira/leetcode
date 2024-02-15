package io.cachola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        String s1 = "anagram";
        String s2 = "nagaram";
        boolean expected = true;
        boolean actual = Anagram.isAnagram(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_differentLength() {
        String s1 = "anagram";
        String s2 = "nagaram1";
        boolean expected = false;
        boolean actual = Anagram.isAnagram(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_differentCase() {
        String s1 = "anagram";
        String s2 = "NAGARAM";
        boolean expected = false;
        boolean actual = Anagram.isAnagram(s1, s2);
        assertEquals(expected, actual);
    }
}