package ru.mirea.task2.task2_4;
import java.util.Scanner;
public class TestDog {
    private Dog a[]=new Dog[1000];
    private int count=0;
    public void addDog(){
        String Name;
        int Age;
        Scanner in = new Scanner(System.in);
        Name= in.nextLine();
        Age=in.nextInt();
        a[count]=new Dog(Name,Age);
        count++;
    }
    public void deleteDog(int Number) {
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
            public void showDog(int Number){
                if (a[Number-1] != null) {
                    System.out.println(a[Number-1].toString());
                }
                else {
                    System.out.println("Not found");
                }
    }
    public static void main(String[] args) {
    TestDog ex = new TestDog();
    ex.addDog();
    ex.addDog();
    ex.addDog();
    ex.showDog(2);
    ex.deleteDog(2);
    ex.showDog(2);
    }
}
