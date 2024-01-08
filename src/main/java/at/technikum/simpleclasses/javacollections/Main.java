package at.technikum.simpleclasses.javacollections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        List<String> names = new LinkedList<>();

        names.add("Bob");
        names.add("Foo");
        names.add("Daa");
        names.add("Max");

        System.out.println(names.size());

        System.out.println(names.get(2));


        List<Integer> integerList = new LinkedList<>();
        Deque<Integer> integerDeque = new LinkedList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerList = null;
        */

        Object test = 5;

        System.out.println(test.getClass());

        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");

        strings.size();

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);

            System.out.println(s);
        }

        for (String s: strings) {
            System.out.println(s);
        }
    }
}
