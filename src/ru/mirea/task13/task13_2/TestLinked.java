package ru.mirea.task13.task13_2;
import java.util.LinkedList;
public class TestLinked {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();

            numbers.add(800);
            numbers.add(120);
            numbers.add(3);
            numbers.add(21);
            numbers.add(137);
            System.out.println(numbers);

            numbers.removeFirst();
            numbers.addLast(141);
            numbers.set(1, 16);
            numbers.add(3, 30);
            System.out.println(numbers);

            System.out.println(numbers.pollLast());
            System.out.println(numbers);
        }
    }

