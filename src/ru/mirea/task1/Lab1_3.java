package ru.mirea.task1;
import java.text.DecimalFormat;//класс для форматирования чисел
public class Lab1_3 {
    public static void main(String[] args) {
        DecimalFormat Formating = new DecimalFormat("0.000");//Установка шаблонна форматирования до 3 знаков после запятой.
        double value;//переменная для записи значения гарм. ряда
        for(double i=1; i<11;i++) {
            value=1/i;
            System.out.print(" "+Formating.format(value));//Форматированный выход
        }
    }
}
