package ru.mirea.task6.task6_1;
public class TestNameable {
    public static void main(String[] args) {
        planet one= new planet("Mars");
        System.out.println(one.getName());
        machine two = new machine ("Tesla");
        System.out.println(two.getName());
        animal three= new animal("Tiger");
        System.out.println(three.getName());

    }
}
