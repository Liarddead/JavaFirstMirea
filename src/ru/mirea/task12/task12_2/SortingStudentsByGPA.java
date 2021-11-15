package ru.mirea.task12.task12_2;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class SortingStudentsByGPA  {
    public int compare(Student o1, Student o2) {
        int value=0;
        if (o1.getStudy_score() > o2.getStudy_score()) {
            value= 1;
        }
        if (o1.getStudy_score() < o2.getStudy_score()) {
            value= -1;
        }
        if (o1.getStudy_score() == o2.getStudy_score()) {
            value= 0;
        }
        return value;
    }
    public void quickSort(Student[] source, int leftBorder, int rightBorder) {
        SortingStudentsByGPA ex1=new SortingStudentsByGPA();
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (ex1.compare(source[leftMarker], pivot)==-1) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (ex1.compare(source[rightMarker], pivot)==1) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
    public static void main(String[] args) {
        Student st[]=new Student[7];
        int Study_score=0;
        for (int i=0;i<7;i++){
            Scanner in = new Scanner(System.in);
            Study_score=in.nextInt();
            st[i]= new Student(0,Study_score);
        }
        System.out.println("Начальный массив");
        for (int i=0;i<7;i++){
            System.out.print(st[i].getStudy_score()+" ");
        }
        SortingStudentsByGPA ex1= new SortingStudentsByGPA();
        ex1.quickSort(st,0,6);
        System.out.println("");
        System.out.println("Отсортированный массив");
        for (int i=0;i<7;i++){
            System.out.print(st[i].getStudy_score()+" ");
        }

    }
}
