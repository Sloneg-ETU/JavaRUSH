package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(40, 1.1));
        System.out.println(convertEurToUsd(10, 1.3));
    }

    public static double convertEurToUsd(int eur, double course) {
        double bucks;
        bucks = eur * course;
        return bucks;
    }
}
