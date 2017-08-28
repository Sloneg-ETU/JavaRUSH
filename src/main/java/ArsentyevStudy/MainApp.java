package ArsentyevStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A Camel Application
 */
public class MainApp {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public MainApp() {
    }

    public boolean fight(MainApp anotherCat) {
        if (this.age < anotherCat.age){
            if (this.strength > anotherCat.strength){
                if (this.weight > anotherCat.weight){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.printl();

    }
}
