package ITIS.lab03;

import java.util.ArrayList;

public class Set<T> {
    private ArrayList<T> elements;

    public Set() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        if (!contains(element)) {
            elements.add(element);
        }
    }

    public ArrayList<T> asList() {
        return new ArrayList<>(elements);
    }

    public void delete(T element) {
        elements.remove(element);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }
}
