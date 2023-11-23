package at.technikum.arrays;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {
        /*
        1. Grade: 3
        2. Grade: 5
        ...
        20. Grade: 4

        Average: 3.2
         */
        /*
        1. Grade: 3
        2. Grade: 5
        3. Grade: -1
        Current Average: 4
        3. Grade: 5
        ...
        20. Grade: 4

        Average: 3.2
         */

        Scanner input = new Scanner(System.in);

        int amount = 5;
        int[] grades = new int[amount];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%d Grade: ", i + 1);
            grades[i] = input.nextInt();
        }

        System.out.printf("Average: %s\n", average(grades));
    }

    private static double average(int[] grades) {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
            // sum += grades[i]
        }
        double average = sum / grades.length;

        return average;

        // return sum / grades.length;
    }
}
