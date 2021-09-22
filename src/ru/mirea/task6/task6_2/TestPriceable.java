package ru.mirea.task6.task6_2;

public class TestPriceable {
    public static void main(String[] args) {
        Food ex1= new Food("pizza", "75");
        System.out.println(ex1.getPrice());
        Car ex2 = new Car("Ford","75");
        System.out.println(ex2.getPrice());
        Tools ex3 = new Tools("Axe", "75");
        System.out.println(ex3.getPrice());
    }
}
