package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine(); //читаем строку с клавиатуры
        //String sSumm = reader.readLine(); //читаем строку с клавиатуры
        //int nSumm = Integer.parseInt(sSumm); //преобразовываем строку в число.
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
