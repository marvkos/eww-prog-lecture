package at.technikum.conditions;

public class Conditions {

    public static void main(String[] args) {
        int age = 17;

        int test = 6;

        if (age >= 18) {
            test = 5;
            System.out.println("Is adult");
            System.out.println(test);

        } else {
            test = 10;
            System.out.println("Is Not adult");
        }

        if (age > 18) {

        } else if (age > 16) {

        } else if (age > 12) {

        } else {

        }

        // do something important

        System.out.println(test);

        System.out.println("End of application");
    }
}
