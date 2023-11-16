package at.technikum.loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Grade (1-5): ");
        int grade = input.nextInt();


        while (1 > grade || grade > 5) {
            System.out.print("Grade (1-5): ");
            grade = input.nextInt();
        }

        /*
        for (; 1 > grade || grade > 5; ) {
            System.out.print("Grade (1-5): ");
            grade = input.nextInt();
        }
        */

        System.out.println("Correct!");
    }
}
