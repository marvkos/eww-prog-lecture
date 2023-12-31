package at.technikum.arrays;

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

            int grade = input.nextInt();
            if (-1 == grade) {
                // current average
                /*
                if (0 != i) {
                    System.out.printf(
                            "Current Average: %s\n",
                            average(grades, i)
                    );
                }
                */
                System.out.printf(
                        "Current Average: %s\n",
                        0 != i ? average(grades, i) : 0
                );


                //i = i - 1;
                i--;
                continue;
            }

            grades[i] = grade;
        }

        System.out.printf("Average: %s\n", average(grades, grades.length));
    }

    private static double average(int[] grades, int amount) {
        double sum = 0.0;
        for (int i = 0; i < amount; i++) {
            sum = sum + grades[i];
            // sum += grades[i]
        }
        double average = sum / amount;

        return average;

        // return sum / grades.length;
    }
}
