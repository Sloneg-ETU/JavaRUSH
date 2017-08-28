package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;
    public int points;

    public Cat() {
    }

    public boolean isolder(int str3, int str4){
        if (str3 < str4) return true;
        else return false;
    }

    public boolean stronger(int strenght1, int strenght2){
        if (strenght1 > strenght2) return true;
        else return false;
    }
    public boolean over(int age1, int age2){
        if (age1 > age2) return true;
        else return false;
    }

    public boolean fight(Cat anotherCat) {
        if (isolder(this.age, anotherCat.age)) {
            this.points += 1;
        } else anotherCat.points += 1;
        if (stronger(this.strength, anotherCat.strength)) {
            this.points += 1;
        } else anotherCat.points += 1;
        if (over(this.weight, anotherCat.weight)) {
            this.points += 1;
        } else anotherCat.points += 1;
        if (this.points > anotherCat.points) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}