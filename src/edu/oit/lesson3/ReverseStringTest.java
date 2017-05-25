package edu.oit.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        assertEquals(ReverseString.reverseString("student"), "tneduts");
        assertEquals(ReverseString.reverseString("abc def"), "fed cba");
        assertEquals(ReverseString.reverseString("100th Street"), "teertS ht001");
    }

}
