package de.telran;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {
    Algorithms alg = new Algorithms();

    @Test
    public void same_numbers() {
        assertEquals(15, alg.findGcd(15, 15));
    }

    @Test
    public void null_both() {
        assertEquals(0, alg.findGcd(0, 0));
    }

    @Test
    public void second_element_one() {
        assertEquals(1, alg.findGcd(30, 1));
    }

    @Test
    public void first_null() {
        assertEquals(15, alg.findGcd(0, 15));
    }

    @Test
    public void second_null() {
        assertEquals(30, alg.findGcd(30, 0));
    }


    @Test
    public void same_numbers2() {
        assertEquals(15, alg.findLcm(15, 15));
    }

    @Test
    public void second_element_one2() {
        assertEquals(30, alg.findLcm(30, 1));
    }
    public void both_elements_is_one2() {
        assertEquals(30, alg.findLcm(1, 1));
    }

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception ex = assertThrows(ArithmeticException.class, () -> {
            alg.findLcm(0, 0);
        });
    }

}

