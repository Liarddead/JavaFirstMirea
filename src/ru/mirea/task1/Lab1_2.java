package ru.mirea.task1;
public class Lab1_2 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)//цикл от 0 до длинны массива аргументов
            System.out.println(String.format("Argument %d: %s", i, args[i]));//форматированный вывод
    }
}// указываем в конфигурации запуска нужные аргументы.
