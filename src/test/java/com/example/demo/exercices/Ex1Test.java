package com.example.demo.exercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {

    @Test
    void testFindFirstDuplicatedNumber() {
        int[] array = { 1, 2, 3, 3, 5 };
        Ex1 ex1 = new Ex1();
        Integer result = ex1.findFirstDuplicatedNumber(array);
        assertEquals(result, 3, "First Duplicate Number should be 3");
    }

    @Test
    @DisplayName("test Find First Duplicated Number Using EmptyArray")
    void testFindFirstDuplicatedNumberUsingEmptyArray() {
        int[] array = {};
        Ex1 ex1 = new Ex1();
        Integer result = ex1.findFirstDuplicatedNumber(array);
        assertNull(result);
    }

    @Test
    void testFindFirstDuplicatedNumberUsingNull() {
        Ex1 ex1 = new Ex1();
        Integer result = ex1.findFirstDuplicatedNumber(null);
        assertNull(result);
    }
}