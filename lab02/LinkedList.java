package ITIS.lab02;

public class LinkedList<T> implements List<T> {
    private Node<T> head;

    private static class Node<E> {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public T get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            current = current.next;
        }
        if (current == null) throw new IndexOutOfBoundsException("Index: " + index);
        return current.data;
    }

    @Override
    public void remove(int index) {
        Node<T> current = null;
        Object data = null;
        for (int i = 0; i < index; i++) {
            current = head.next;
            data = current.data;
        }
        current.data = (T) data;
    }

    @Override
    public void removeLast() {
        if (head == null) throw new IllegalStateException("List is empty");
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    @Override
    public void printAll() {
        if (head == null) return;
        Node current = head;
        System.out.println(current.data);
        while (current.next != null) {
            System.out.println(current.next.data);
            current = current.next;
        }
    }
}
