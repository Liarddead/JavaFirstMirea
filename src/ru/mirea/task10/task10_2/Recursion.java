package ru.mirea.task10.task10_2;
public class Recursion {
    public int show(int n){
        System.out.print(n+" ");
        if (n==1){
            return 0;
        }
        else{
            return show(n-1);
        }
    }

    public static void main(String[] args) {
        Recursion ex1= new Recursion();
        ex1.show(25);
    }
}
