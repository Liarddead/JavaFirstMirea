package ru.mirea.task1;
import java.util.Arrays;
import java.util.Random;
public class Lab1_4 {
    public static void main(String[] args) {
        int [] a=new int[10];//Массивы на 10 элем.
        int [] b=new int[10];
        for (int i =0; i<10;i++){
            a[i]=(int)(Math.random()*101);//генерация массива через Math.random в промежутке 0 до 100
        }
        for (int i =0; i<10;i++){
            System.out.print(" "+a[i]);//вывод
        }
        Arrays.sort(a);//сортировка массива методом Arrays.sort
        System.out.println(" ");
        for (int i =0; i<10;i++) {
            System.out.print(" " + a[i]);//вывод
        }
        //реализация через класс Random()
        System.out.println(" ");
        Random r = new Random();
        for (int i =0; i<10;i++){
            b[i]= r.nextInt(100)+1;//генерация массива через Random в промежутке 0 до 100
        }
        for (int i =0; i<10;i++){
            System.out.print(" "+b[i]);//вывод
        }
        Arrays.sort(b);//сортировка массива методом Arrays.sort
        System.out.println(" ");
        for (int i =0; i<10;i++) {
            System.out.print(" " + b[i]);//вывод
        }
    }
}

