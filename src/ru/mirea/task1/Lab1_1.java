package ru.mirea.task1;
public class Lab1_1 {
    public static void main(String[] args) {
        int [] a=new int[]{0,1,2,3,4,5,6,7,8,9};//Объявляем массив
        int sum=0,count=0;//объявляем переменные для суммы и счетчика
        for (int i =0; i<10;i++){
            sum+=a[i];
        }//считаем сумму через for
        System.out.println(sum);//Вывод
        sum=0;//сбрасываем значение суммы
        while (count<10){
            sum+=a[count];
            count++;
        }//считаем сумму через While
        System.out.println(sum);//Вывод
        sum=0;//сбрасываем значение суммы
        count=0;//сбрасываем значение счётчика
        do{
            sum+=a[count];
            count++;
        }while(count<10);//считаем сумму через  Do While
        System.out.println(+sum);//Вывод
    }
}

