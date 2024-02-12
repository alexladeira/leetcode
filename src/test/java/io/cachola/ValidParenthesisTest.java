package io.cachola;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    void isValid() {
        assertTrue(ValidParenthesis.isValid("()"));
    }

    @Test
    void isValid2() {
        assertTrue(ValidParenthesis.isValid("()[]{}"));
    }

    @Test
    void isNotValid() {
        assertFalse(ValidParenthesis.isValid("(]"));
    }
}