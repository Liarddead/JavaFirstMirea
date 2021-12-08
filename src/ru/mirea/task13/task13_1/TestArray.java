package ru.mirea.task13.task13_1;
import java.util.ArrayList;
import java.util.Collections;
public class TestArray{

    public static void main(String[] args) {
ArrayList<String> Name= new ArrayList<>();
        String name1 = "Aлкесандр";
        String name2 = "Алексей";
        String name3 = "Игорь";
        String name4 = "Филип";
        Name.add(name1);
        Name.add(name2);
        Name.add(name3);
        Name.add(name4);
        System.out.println("Name.size() = " +Name.size());
        int Name3Index = Name.indexOf(name3);
        System.out.println(Name3Index);

        String name = Name.get(1);
        System.out.println(name);

        Name.remove(name4);

        Name.set(1, "Иван");
        Name.add(0, "Aнна");
        Name.add("Настя");
        System.out.println(Name.contains(name2) + ", " + Name.contains(name) + ", " + Name.contains("Джон"));

        System.out.println(Name.toString());
        System.out.println(Name.size());
        Collections.sort(Name);
        System.out.println(Name.toString());

        Name.clear();
        System.out.println(Name.toString());

    }
}
