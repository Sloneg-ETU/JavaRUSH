package ArsentyevStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A Camel Application
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int result = seconds % 3600;
        return result;
    }
}