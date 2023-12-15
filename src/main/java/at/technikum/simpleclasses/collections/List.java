package at.technikum.simpleclasses.collections;

public interface List {

    void add(int i);

    int getAt(int index);

    void removeAt(int index);

    void print();

    boolean contains(int i);

    int size();
}
