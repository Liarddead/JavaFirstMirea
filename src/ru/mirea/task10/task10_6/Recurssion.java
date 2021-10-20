package ru.mirea.task10.task10_6;

public class Recurssion {
    public void simple(int num){
        int temp;
        boolean isPrime=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if(isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Recurssion ex1= new Recurssion();
        ex1.simple(113);
    }
}
