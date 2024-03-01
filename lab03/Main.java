package ITIS.lab03;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new Set<>();
        stringSet.add("First");
        stringSet.add("Second");
        stringSet.add("Second");
        stringSet.add("Third");
        stringSet.asList().forEach(System.out::println);
        System.out.println(stringSet.contains("First"));
        stringSet.delete("Third");
        stringSet.asList().forEach(System.out::println);
        System.out.println("---------------------");
        Stack<String> stringStack = new Stack<>();
        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");
        System.out.println(stringStack.size());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.size());
    }
}
