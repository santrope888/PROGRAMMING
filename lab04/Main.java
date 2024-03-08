package ITIS.lab04;

public class Main {
    public static void main(String[] args) {
        MapInf304<String, Person> peopleMap = new CustomMap<>();
        peopleMap.put("0430 566899", new Person("Тимур", "Валеев", 25));
        peopleMap.put("5422 495666", new Person("Елена", "Иванова", 29));
        peopleMap.put("1470 423445", new Person("Павел", "Сидоров", 19));

        System.out.println("Человек по номеру паспорта '5422 495666': "+ peopleMap.get("5422 495666"));
        System.out.println("Удалённый элемент по ключу '1470 423445': " + peopleMap.remove("1470 423445"));
        if (peopleMap.containsKey("0430 566899")) {
            System.out.println("Номер паспорта '0430 566899' есть в map");
        } else {
            System.out.println("Номера паспорта '0430 566899' нет в map");
        }

        System.out.println("Список значений: ");
        peopleMap.values().forEach(System.out::println);
        System.out.println("Список ключей: ");
        peopleMap.keySet().forEach(System.out::println);
    }
}