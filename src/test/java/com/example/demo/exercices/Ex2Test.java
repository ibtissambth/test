package com.example.demo.exercices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex2Test {

    @Test
    void testPrintString() {
        Ex2 ex2 = new Ex2();
        String result = ex2.printString(1);
        assertEquals(result, "ab");
    }

    @Test
    void testPrintStringWithParamZero() {
        Ex2 ex2 = new Ex2();
        String result = ex2.printString(0);
        assertEquals(result, "");
    }

    @Test
    void testPrintStringWithNegativeNumber() {
        Ex2 ex2 = new Ex2();
        String result = ex2.printString(-1);
        assertEquals(result, "");
    }
}