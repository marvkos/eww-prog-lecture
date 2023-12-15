package at.technikum.simpleclasses.collections;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(2);

        list.print();
        System.out.println();

        System.out.println(list.size());
        System.out.println();

        list.removeAt(0);

        list.print();
        System.out.println();

        System.out.println(list.size());
        System.out.println();

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);

        System.out.println(list.size());

    }
}
