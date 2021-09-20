package ru.mirea.task2_1;
public class TestShape {
    public static void main(String[] args) {
        Shape ex1=new Shape("Circle","blue");
        ex1.SetName("square");
        ex1.SetColour("red");
        System.out.println(ex1.toString());
    }
}
