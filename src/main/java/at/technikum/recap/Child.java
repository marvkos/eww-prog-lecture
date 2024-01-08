package at.technikum.recap;

public class Child extends Parent {

    public Child(int age, String name, String address) {
        super(age, name, address);
    }

    @Override
    public void foo() {
        super.foo();
        System.out.println("Child");
    }
}
