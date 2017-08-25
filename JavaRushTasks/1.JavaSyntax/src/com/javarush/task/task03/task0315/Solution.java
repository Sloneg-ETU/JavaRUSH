package com.javarush.task.task03.task0315;

/* 
Каждый охотник желает знать…
*/

import com.sun.org.apache.regexp.internal.RE;

public class Solution {
    public static void main(String[] args) {
        Red RR = new Red();
        Orange OO = new Orange();
        Yellow YY = new Yellow();
        Green GG = new Green();
        Blue BB = new Blue();
        Indigo II = new Indigo();
        Violet VV = new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
