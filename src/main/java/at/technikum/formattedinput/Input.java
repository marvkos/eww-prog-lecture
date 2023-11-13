package at.technikum.formattedinput;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("x (input int): ");
        int x = input.nextInt();

        int volume = x * x * x;
        int surfaceArea = 6 * x * x;

        System.out.printf("Volume: %d\n", volume);
        System.out.printf("Surface Area: %d\n", surfaceArea);
    }
}
