package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void reverseStringReversesNormalWord() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reverseStringReversesSentence() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
    }

    @Test
    void reverseStringHandlesEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reverseStringHandlesSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }
}
