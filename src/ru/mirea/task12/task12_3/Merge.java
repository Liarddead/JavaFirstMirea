package ru.mirea.task12.task12_3;

import ru.mirea.task12.task12_2.SortingStudentsByGPA;
import ru.mirea.task12.task12_2.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public Student[] mergeArray(Student[] arrayA, Student[] arrayB) {
        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == (arrayA.length)) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
            else if (positionB == (arrayB.length)) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            }
            else if (arrayA[positionA].getStudy_score() < arrayB[positionB].getStudy_score()) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            }
            else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return sortExtra(arrayC);
    }
    public Student[] sortExtra(Student[] array){
        for (int left = 0; left <array.length; left++) {
            Student value = array[left];
            int Id_value=array[left].getStudy_score();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (Id_value < array[i].getStudy_score()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }
    public Student[] sortArray(Student[] arrayA){ // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        Student [] arrayB = new Student [arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        Student [] arrayC = new Student [arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public static void main(String[] args) {
        Student st1[]=new Student[4];
        Student st2[]=new Student[4];
        int Study_score=0;
        for (int i=0;i<4;i++){
            Scanner in = new Scanner(System.in);
            Study_score=in.nextInt();
            st1[i]= new Student(0,Study_score);
        }
        for (int i=0;i<4;i++){
            Scanner in = new Scanner(System.in);
            Study_score=in.nextInt();
            st2[i]= new Student(0,Study_score);
        }
        System.out.println("Начальный массив 1");
        for (int i=0;i<4;i++){
            System.out.print(st1[i].getStudy_score()+" ");
        }
        System.out.println("");
        System.out.println("Начальный массив 2");
        for (int i=0;i<4;i++){
            System.out.print(st2[i].getStudy_score()+" ");
        }
        System.out.println("");
        Merge ex1= new Merge();
        Student[] st=ex1.mergeArray(st1,st2);
        System.out.println("Отсортированный массив");
        for (int i=0;i<8;i++){
            System.out.print(st[i].getStudy_score()+" ");
        }

    }
}

