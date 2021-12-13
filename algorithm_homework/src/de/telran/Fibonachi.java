package de.telran;

////Найти последнюю цифру числа фибоначи под номером до 2^31-1
//Найти остаток от деления числа фибоначи под номером до 2^31-1 на положительное число m
public class Fibonachi {

    public static int findLastNumber(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int temp;
        for (int i = 2; i <= n ; i++) {
            temp = (secondNumber + firstNumber) % 10;//присваеваем последнюю цифру
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        return secondNumber;
    }

   public static int findModOfLastNumber(int number, int m) {
        int firstNumber = 0;
        int secondNumber = 1;
        int temp;
        for (int i = 2; i <= number ; i++) {
            temp = (secondNumber + firstNumber) % m;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        return secondNumber;
    }
}
