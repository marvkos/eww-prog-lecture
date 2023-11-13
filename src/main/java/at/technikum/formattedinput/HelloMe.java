package at.technikum.formattedinput;

import java.util.Scanner;

public class HelloMe {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Your Name: ");
        String name = consoleInput.next();

        System.out.printf("Hello %s", name);
    }
}
