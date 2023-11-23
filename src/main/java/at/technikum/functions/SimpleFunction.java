package at.technikum.functions;

public class SimpleFunction {

    public static void main(String[] args) {
        /*
        for (int i = 0; i < X; i = i + 1) {
            System.out.println("X");
        }
         */

        greetMe(2, "Marvin", "german");
        System.out.println("Test");
        greetMe(8, "Tim", "french");
    }

    private static void greetMe(int repetition, String name, String language) {
        String greet = greeting(language);

        for (int i = 0; i < repetition; i = i + 1) {
            System.out.printf("%s %s\n", greet, name);
        }
    }

    private static String greeting(String language) {
        if (language.equals("german")) {
            return "Hallo";
        }
        if (language.equals("french")) {
            return "Bonjour";
        }

        return "Hello";
    }

}
