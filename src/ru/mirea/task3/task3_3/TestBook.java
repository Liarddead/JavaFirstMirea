package ru.mirea.task3.task3_3;

public class TestBook {
    public static void main(String[] args) {
        Book ex1= new Book("J.Rolling","Hary poter",2007);
        ex1.setAuthor("J.Rowling");
        ex1.setName("Harry Potter");
        ex1.setYear(1995);
        System.out.println(ex1.toString());
    }

}
