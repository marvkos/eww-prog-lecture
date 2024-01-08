package at.technikum.recap;

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent(30, "Max", "Wien");


        p.foo();

        Child c = new Child(10, "Max2", "Wien");

        c.foo();
    }
}
