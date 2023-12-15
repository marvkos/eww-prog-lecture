package at.technikum.simpleclasses.javacollections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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
    }
}
