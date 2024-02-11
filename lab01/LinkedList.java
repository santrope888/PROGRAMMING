package ITIS.lab01;

public class LinkedList implements List {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public int get(int index) {
        if (head == null || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Node current = head;
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
    public void remove(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current != null) prev.next = current.next;
    }

    @Override
    public int removeLast() {
        if (head == null) throw new IllegalStateException("List is empty");
        int lastValue;

        if (head.next == null) {
            lastValue = head.data;
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            lastValue = current.next.data;
            current.next = null;
        }
        return lastValue;
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
