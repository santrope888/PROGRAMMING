package ITIS.lab01;

public interface List {
    void add(int data);

    int get(int index);

    void remove(int index);

    int removeLast();

    void printAll();
}
