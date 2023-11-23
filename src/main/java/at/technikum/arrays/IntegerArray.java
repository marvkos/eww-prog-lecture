package at.technikum.arrays;

public class IntegerArray {

    public static void main(String[] args) {
        int[] m = new int[5];

        System.out.println(m[0]);

        m[0] = 5;

        System.out.println(m[0]);

        // System.out.println(m[5]); OutOfBounds

        System.out.println("All array values:");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            if (i < m.length) {
                arr2[i] = m[i];
            }
        }
    }
}
