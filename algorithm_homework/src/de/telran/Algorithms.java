package de.telran;
//Найти остаток от деления числа фибоначи под номером до 2^31-1 на положительное число m
//найти НОД (нибольший общий делитель), найти НОК.

public class Algorithms {
    static int findGcd(int firstNumber, int secondNumber) {
        int result = 0;
        for (int i = 1; i <= Math.min(firstNumber, secondNumber); i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0)
                result = i;
        }
        return result;
    }

    /**
     * The method must find least common multiple numbers
     *
     * @param   number1 number whose lsm you want to know
     * @param  number2 any number whose lsm you want to know
     * @return  least common multiple numbers
     * @throws ArithmeticException if any of numbers equals zero
     */
    static int findLcm(int number1, int number2) {
        int result = 0;
        if (number1==0 || number2==0)
            throw new ArithmeticException();
        result =  number1* number2 / findGcd(number1, number2);
        return result;
    }
}
