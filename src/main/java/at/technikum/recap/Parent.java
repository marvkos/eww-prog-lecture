package at.technikum.recap;

public class Parent {

    public int age;

    private String name;

    protected String address;

    public Parent(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void foo() {
        System.out.println("Parent");
    }
}
