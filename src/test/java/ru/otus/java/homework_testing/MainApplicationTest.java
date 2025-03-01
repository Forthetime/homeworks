package ru.otus.java.homework_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.otus.java.homework_testing.MainApplication.consistOfOneAndTwo;
import static ru.otus.java.homework_testing.MainApplication.returnArrayAfterOne;

class MainApplicationTest {

    @Test
    void testReturnArrayAfterOne() {
        int[] arr = {1, 2, 1, 1, 2, 2, 2, 2, 4};
        int[] expected = {2, 2, 2, 2, 4};
        int[] fact = returnArrayAfterOne(arr);
        Assertions.assertArrayEquals(expected, fact);
    }

    @Test
    void testReturnArrayAfterOneException() {
        int[] arr = {2, 2, 2, 2, 4};
        Assertions.assertThrows(RuntimeException.class, () -> {
            returnArrayAfterOne(arr);
        });
    }

    @Test
    void testConsistOfOneAndTwo() {
        int[] arr = {1,2};
        Assertions.assertTrue(consistOfOneAndTwo(arr));
    }

    @Test
    void testConsistOfOnlyOne() {
        int[] arr = {1,1};
        Assertions.assertFalse(consistOfOneAndTwo(arr));
    }

    @Test
    void testConsistOfNoTwo() {
        int[] arr = {1,3};
        Assertions.assertFalse(consistOfOneAndTwo(arr));
    }

    @Test
    void testConsistOfManyOneAndTwo() {
        int[] arr = {1,2,2,1,1,2};
        Assertions.assertTrue(consistOfOneAndTwo(arr));
    }
}