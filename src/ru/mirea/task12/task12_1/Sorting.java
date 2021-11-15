package ru.mirea.task12.task12_1;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
Student st[]=new Student[7];
int NumberId=0;
for (int i=0;i<7;i++){
    Scanner in = new Scanner(System.in);
    NumberId=in.nextInt();
    st[i]= new Student(NumberId,0);
}
System.out.println("Начальный массив");
for (int i=0;i<7;i++){
    System.out.print(st[i].getIdNumber()+" ");
}
        for (int left = 0; left <7; left++) {
            // Вытаскиваем значение элемента
            Student value = st[left];
            int Id_value=st[left].getIdNumber();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (Id_value < st[i].getIdNumber()) {
                    st[i + 1] = st[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            st[i + 1] = value;
        }
        System.out.println("");
        System.out.println("Отсортированный массив");
        for (int i=0;i<7;i++){
            System.out.print(st[i].getIdNumber()+" ");
        }
    }
}
