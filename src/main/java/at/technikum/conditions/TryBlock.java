package at.technikum.conditions;

import java.util.Scanner;

public class TryBlock {

    public static void main(String[] args) {


        // String s = null;
        // s.length();

        try (Scanner input = new Scanner(System.in)) {
            String test = "Hello";
            test.length();

            System.out.println("test");
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}
