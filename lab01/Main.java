package ITIS.lab01;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        List numbers = new ArrayList();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.println("ArrayList");
        System.out.println("Все элементы списка");
        numbers.printAll();
        System.out.println("---");
        System.out.print("Удаление последнего элемента ");
        System.out.println(numbers.removeLast());
        System.out.println("---");
        System.out.println("Все элементы списка");
        numbers.printAll();
        System.out.println("---");
        System.out.println("Элемент по индексу 0: " + numbers.get(0));
        System.out.println();
        // LinkedList
        numbers = new LinkedList();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.println("LinkedList");
        System.out.println("Все элементы списка");
        numbers.printAll();
        System.out.println("---");
        System.out.print("Удаление последнего элемента ");
        System.out.println(numbers.removeLast());
        System.out.println("---");
        System.out.println("Все элементы списка");
        numbers.printAll();
        System.out.println("---");
        System.out.println("Элемент по индексу 0: " + numbers.get(0));
    }
}