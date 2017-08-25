package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg[] ZRG = new Zerg[10];
        for (int i = 0; i < 10; i++){
            ZRG[i] = new Zerg();
            ZRG[i].name = "ZERG_NAME_" + i;
        }
        Protoss[] PRT = new Protoss[5];
        for (int i = 0; i < 5; i++){
            PRT[i] = new Protoss();
            PRT[i].name = "PROTOSS_NAME_" + i;
        }
        Terran[] TRN = new Terran[12];
        for (int i = 0; i < 12; i++){
            TRN[i] = new Terran();
            TRN[i].name = "TERRAN_GNAME_" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
