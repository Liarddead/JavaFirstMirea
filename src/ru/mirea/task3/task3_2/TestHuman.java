package ru.mirea.task3.task3_2;

public class TestHuman {
    public static void main(String[] args) {
        Human ex1= new Human("Alfred", 45);
        Head ex2=new Head();
        System.out.println(ex1.getAge());
        ex2.setEyescolour("blue");
        System.out.println(ex2.getEyescolour());
    }
}
