package ru.mirea.task7.task7_1;
public class TestMoveable {
    public static void main(String[] args) {
        MoveableRectangle ex1= new MoveableRectangle(0,0,10,10,5,4);
        System.out.println(ex1.toString());
        ex1.moveUp();
        System.out.println(ex1.toString());
    }
}
