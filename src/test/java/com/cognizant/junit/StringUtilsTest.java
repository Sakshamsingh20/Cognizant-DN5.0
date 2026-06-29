package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    public void testIsEmpty() {
        assertTrue(utils.isEmpty(""));        // "" should be empty
        assertFalse(utils.isEmpty("Hello"));  // "Hello" is NOT empty
        System.out.println("isEmpty tests passed!");
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertNotEquals("hello", utils.toUpperCase("hello")); // should NOT stay lowercase
        System.out.println("toUpperCase tests passed!");
    }

    @Test
    public void testReverse() {
        assertEquals("olleH", utils.reverse("Hello"));
        assertNotNull(utils.reverse("Java")); // result should not be null
        System.out.println("reverse tests passed!");
    }

    @Test
    public void testGetLength() {
        assertEquals(5, utils.getLength("Hello"));
        assertNotEquals(3, utils.getLength("Hello")); // length is NOT 3
        System.out.println("getLength tests passed!");
    }
}