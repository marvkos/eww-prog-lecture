package at.technikum.conditions;

public class SwitchCase {

    public static void main(String[] args) {
        int age = 11;

        switch (age) {
            case 10:
                System.out.println("Happy 10th birthday");
                break;
            case 11:
                System.out.println("Happy 11th birthday");
                break;
            default:
                System.out.println("No Happy Birthday for you");
        }

        System.out.println("Test");
    }
}
