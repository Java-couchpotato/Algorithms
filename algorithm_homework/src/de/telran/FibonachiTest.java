package de.telran;

import org.junit.Test;

class FibonachiTest {
Fibonachi fib = new Fibonachi();

@Test(expected = ArithmeticException.class)
    public void devide_null(){
    fib.findModOfLastNumber(0,0);
}
}