package de.telran;
//Найти последнюю цифру числа фибоначи под номером до 2^31-1
//Найти остаток от деления числа фибоначи под номером до 2^31-1 на положительное число m
//найти НОД (нибольший общий делитель), найти НОК.
public class Algorithms {
    public static void main(String[] args) {
        System.out.println(findNod(30,8));
    }
    static int findNod(int firstNumber,int secondNumber){

      int result=0;
        for (int i = 1; i <= Math.max(firstNumber,secondNumber); i++) {
            if (firstNumber%i==0 && secondNumber%i==0)
                result=i;
        }
        return result;
    }
}
