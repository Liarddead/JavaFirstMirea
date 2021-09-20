package ru.mirea.task5.task5_1;
public class TestDish {
    public static void main(String[] args) {
        Plate one = new Plate("Sam","consider food");
        System.out.println(one.getFunction());
        one.setSize("Big");
        System.out.println(one.getSize());
        Spoon two = new Spoon("Jerry","using to eat food");
        System.out.println(two.getName());
        two.setLength(10);
        System.out.println(two.getLength());
        Cup three = new Cup("Tomas","using to drink ");
        System.out.println(three.getFunction());
        three.setColour("blue");
        System.out.println(three.getColour());
    }
}
