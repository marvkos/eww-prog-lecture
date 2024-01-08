package at.technikum.exampleexam.copyconstructor;

public class Test {

    private String name;

    private boolean done;

    public Test(String name, boolean done) {
        this.name = name;
        this.done = done;
    }

    public Test(Test test) {
        this.name = test.getName();
        this.done = test.isDone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
