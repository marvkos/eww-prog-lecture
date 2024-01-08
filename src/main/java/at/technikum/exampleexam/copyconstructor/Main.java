package at.technikum.exampleexam.copyconstructor;

public class Main {

    public static void main(String[] args) {
        Test testA = new Test("Final Exam", false);

        Test testB = new Test(testA);

        System.out.println(testA.getName());

        System.out.println(testB.getName());


    }
}
