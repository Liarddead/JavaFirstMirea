package ru.mirea.task5.task5_2;
public class TestDog {
    public static void main(String[] args) {
        Dachshund ex1 = new Dachshund();
        ex1.setFriendly(true);
        ex1.setName("Choka");
        System.out.println(ex1.getName());
        Bulldog ex2 = new Bulldog();
        ex2.setSkincolour("roody");
        ex2.setAge(7);
        System.out.println(ex2.getSkincolour());
        Hound ex3 = new Hound();
        ex3.setNikname("Putcher");
        ex3.setName("Jerry");
        System.out.println(ex3.getNikname());
    }
}
