package at.technikum.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("a: ");
                a = scanner.nextInt();

                System.out.print("b: ");
                b = scanner.nextInt();

                System.out.println(a / b);
            } catch (InputMismatchException e) {
                System.out.println("Input has to be an integer");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        }
    }
}
