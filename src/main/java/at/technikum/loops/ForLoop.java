package at.technikum.loops;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i = i + 1) {
            System.out.printf("%d Hello\n", i + 1);
        }

        int i = 0;
        while (i < 10) {
            System.out.printf("%d Hello\n", i + 1);

            i = i + 1;
        }
    }
}
