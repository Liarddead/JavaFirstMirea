package ru.mirea.task10.task10_3;

import ru.mirea.task10.task10_2.Recursion;

public class Recurssion {
    public int show(int A, int B){
if (A<B){
    while(A<=B){
        System.out.print(" "+ (A++));
    }
    return 0;
}
else{
    System.out.print(A+" ");
    if (B==A){
        return 0;
    }
    else{
        return show(A-1,B);
    }
}
    }
    public static void main(String[] args) {
        Recurssion ex1= new Recurssion();
        ex1.show(15,25);
    }
}
