package at.technikum.types;

public class Types {

    public static void main(String[] args) {
        int integer = 123;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println();
        long longInt = 123456;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        short shortInteger = 1;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println();

        float f = 123.123f;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        double d = 123.123;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println();

        char character = 'd';

        System.out.println((int) character);
        System.out.println((int) 123.543f);

        boolean bool = true; // false;
    }
}
