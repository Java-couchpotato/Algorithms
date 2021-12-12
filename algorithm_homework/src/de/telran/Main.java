package de.telran;

import static de.telran.Algorithms.findGcd;
import static de.telran.Algorithms.findLcm;
import static de.telran.Fibonachi.findLastNumber;


public class Main {

    public static void main(String[] args) {
         Algorithms algorithms = new Algorithms();
        System.out.println(findGcd(30,15));
       System.out.println(findLcm(30,15));
       System.out.println(findLastNumber(15));

       Fibonachi fibonachi = new Fibonachi();
        System.out.println(fibonachi.findModOfLastNumber(124,6));
    }
}
