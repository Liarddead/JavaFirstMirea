package ru.mirea.task6.task6_1;
public interface Nameable {
    String getName();
}
class planet implements Nameable{
    private String name;
    planet(String Name){
        name=Name;
    }

    public String getName() {
        return name;
    }
}

class machine implements Nameable{
    private String name;
    machine(String Name){
        name=Name;
    }

    public String getName() {
        return name;
    }
}

class animal implements Nameable{
    private String name;
    animal(String Name){
        name=Name;
    }

    public String getName() {
        return name;
    }
}