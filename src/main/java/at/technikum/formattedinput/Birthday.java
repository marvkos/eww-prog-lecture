package at.technikum.formattedinput;

import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        // DDMMYY
        System.out.print("Birthday: ");
        int birthday = consoleInput.nextInt();

        int day = birthday / 10000;
        int month = birthday / 100 % 100;
        int year = birthday % 100;

        // YYMMDD
        System.out.printf("Output: %02d%02d%02d", year, month, day);

        consoleInput.close();
    }
}
