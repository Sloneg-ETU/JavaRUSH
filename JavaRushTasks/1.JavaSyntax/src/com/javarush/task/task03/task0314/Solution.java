package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int myarray1[] = new int[10];
        int myarray2[] = new int[10];
        int k = 1;
        int l = 1;
        for (int i = 0; i < 10; i++){
            myarray1[i] = k;
            k++;
            for (int j = 0; j < 10; j++){
                myarray2[j] = l;
                l++;
                System.out.print(myarray1[i] * myarray2[j] + " ");
            }
            l = 1;
            System.out.println("");
        }
    }
}
