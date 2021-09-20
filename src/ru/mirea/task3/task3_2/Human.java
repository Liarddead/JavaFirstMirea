package ru.mirea.task3.task3_2;
public class Human {
    private String name;
    private int age;
    public Human(String Name, int Age){
        name=Name;
        age=Age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class Hand {
    private String side;
    private String special_characteristic;

    public void setSide(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public String getSpecial_characteristic() {
        return special_characteristic;
    }

    public void setSpecial_characteristic(String special_characteristic) {
        this.special_characteristic = special_characteristic;
    }
}

class Head{
    private String haircolour;
    private  String eyescolour;
    private  String size;
    public void setEyescolour(String eyescolour) {
        this.eyescolour = eyescolour;
    }

    public void setHaircolour(String haircolour) {
        this.haircolour = haircolour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getEyescolour() {
        return eyescolour;
    }

    public String getHaircolour() {
        return haircolour;
    }

    public String getSize() {
        return size;
    }
}

class Leg {
    private String side;
    private String special_characteristic;

    public void setSide(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public String getSpecial_characteristic() {
        return special_characteristic;
    }

    public void setSpecial_characteristic(String special_characteristic) {
        this.special_characteristic = special_characteristic;
    }
}