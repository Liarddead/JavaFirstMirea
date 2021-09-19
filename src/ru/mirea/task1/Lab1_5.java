package ru.mirea.task1;
public class Lab1_5 {
    public static int GetFactorial(int f){//Метод для вычесления факториала
        int result = 1;
        for (int i = 1; i <= f; i++) {//цикл вычисления факториала
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(GetFactorial(6));// вывод факториала от 6
    }
}

