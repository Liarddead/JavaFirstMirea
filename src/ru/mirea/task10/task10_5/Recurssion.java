package ru.mirea.task10.task10_5;
public class Recurssion {
    public int sumNum(int a) {
        int n = a % 10;
        int k = a / 10;
        if (a==0) {
            return 0;
        } else {
            return n + sumNum(k);
        }
    }

    public static void main(String[] args) {
Recurssion ex1= new Recurssion();
        System.out.println(ex1.sumNum(635));
}
}