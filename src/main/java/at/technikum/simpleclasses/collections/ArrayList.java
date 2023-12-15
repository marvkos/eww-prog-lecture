package at.technikum.simpleclasses.collections;

public class ArrayList implements List {

    private int[] integers;

    private int counter;

    public ArrayList() {
        integers = new int[10];
        counter = 0;
    }

    @Override
    public void add(int number) {
        if (counter >= integers.length) {
            resize(integers.length + 10);
        }

        integers[counter] = number;
        counter++;
    }

    private void resize(int newSize) {
        int[] newIntegers = new int[newSize];

        for (int i = 0; i < integers.length; i++) {
            newIntegers[i] = integers[i];
        }

        integers = newIntegers;
    }

    @Override
    public int getAt(int index) {
        if (index >= counter || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return integers[index];
    }

    @Override
    public void removeAt(int index) {
        for (int i = index; i < counter - 1; i++) {

            integers[i] = integers[i + 1];
        }

        counter--;
    }

    @Override
    public void print() {
        for (int i = 0; i < counter; i++) {
            System.out.println(integers[i]);
        }
    }

    @Override
    public boolean contains(int number) {
        for (int i = 0; i < counter; i++) {
            if (integers[i] == number) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return counter;
    }
}
