package at.technikum.calculations;

import java.math.BigInteger;

public class Cube {

    public static void main(String[] args) {
        int x = 5;

        int volume = x * x * x;
        int surfaceArea = 6 * x * x;

        System.out.printf("Volume: %d\n", volume);
        System.out.printf("Surface Area: %d\n", surfaceArea);
    }
}
