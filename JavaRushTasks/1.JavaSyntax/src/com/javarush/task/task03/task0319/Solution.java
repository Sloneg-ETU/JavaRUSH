package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine(); //читаем строку с клавиатуры
        String sAge = reader.readLine(); //читаем строку с клавиатуры
        String sSumm = reader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        int nSumm = Integer.parseInt(sSumm); //преобразовываем строку в число.
        System.out.println(name + " получает " + nAge + " через " + nSumm + " лет.");
    }
}
