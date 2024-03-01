package ITIS.lab02;

public interface List<T> {
    void add(T data);

    T get(int index);

    void remove(int index);

    void removeLast();

    void printAll();
}
