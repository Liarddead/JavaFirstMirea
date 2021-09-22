package ru.mirea.task5.task5_3;

import ru.mirea.task2.task2_4.Dog;

import java.util.Scanner;

public class  FurnitureShop{
    private Furniture a[]=new Furniture[1000];
    private int count=0;
    public void setCost(int Number,int Cost){
        if (a[Number-1] != null) {
            a[Number-1].setCost(Cost);
        }
        else {
            System.out.println("Not found");
        }
    }
    public void getCost(int Number){
        if (a[Number-1] != null) {
            System.out.println(a[Number - 1].getCost());
        }
        else {
            System.out.println("Not found");
        }
    }

    public void addFurniture(){
        String Name;
        String Type;
        Scanner in = new Scanner(System.in);
        Name= in.nextLine();
        Type=in.nextLine();
        a[count]=new Furniture(Name, Type) {
        };
        count++;
    }
    public void deleteFurniture(int Number) {
        if (a[Number-1] != null) {
            a[Number-1] = null;
            for (int i = Number-1; i < 999; i++) {
                a[i] = a[i + 1];
            }
            count--;
        }
        else {
            System.out.println("Not found");
        }
    }
    public void showFurniture(int Number){
        if (a[Number-1] != null) {
            System.out.println(a[Number-1].toString());
        }
        else {
            System.out.println("Not found");
        }
    }

}
