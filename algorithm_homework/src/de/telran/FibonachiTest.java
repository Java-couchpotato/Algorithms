package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonachiTest {
Fibonachi fib = new Fibonachi();
    @Test
    void both_numbers_one() {
        assertEquals(1,fib.findModOfLastNumber(1,1));
    }

    @Test
    void first_numbers_is_0() {
        assertEquals(1,fib.findModOfLastNumber(0,1));
    }


    @Test
    void devider_is_0() {
        assertEquals(1,fib.findModOfLastNumber(1,0));
    }

    @Test
    void number_is_incorrect_type() {
        Exception exept = assertThrows(NumberFormatException.class, () -> {
               fib.findModOfLastNumber(Integer.parseInt("string"),0);});
    }
}