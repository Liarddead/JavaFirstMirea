package ru.mirea.task4.task4_1;
public class TestAuthor {
    public static void main(String[] args) {
        Author one = new Author("Alexander","alexander@yandex.ru", 'M');
        System.out.println(one.getName());
        one.setEmail("alexander-kraun@mail.ru");
        System.out.println(one.getEmail());
        System.out.println(one.getGender());
        System.out.println(one.toString());
    }
}
