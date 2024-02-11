package ITIS.lab01;

public class ArrayList implements List {
    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public ArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int data) {
        if (size == elementData.length) increaseCapacity();
        elementData[size++] = data;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (Integer) elementData[index];
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
    public int removeLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int newSize = --size;
        int lastValue = (int) elementData[newSize];
        elementData[newSize] = null;
        return lastValue;
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
