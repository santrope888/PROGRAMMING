package ITIS.lab02;

public class ArrayList<T> implements List<T> {
    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public ArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(T data) {
        if (size == elementData.length) increaseCapacity();
        elementData[size++] = data;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (T) elementData[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        elementData[--size] = null;
    }

    @Override
    public void removeLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int newSize = --size;
        elementData[newSize] = null;
    }


    @Override
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementData[i]);
        }
    }

    private void increaseCapacity() {
        int newCapacity = elementData.length * 2;
        Object[] newElementData = new Object[newCapacity];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }
}
