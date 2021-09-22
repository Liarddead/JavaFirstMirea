package ru.mirea.task5.task5_2;
public abstract class Dog {
    private String name;
    private int age;
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
class Hound extends Dog{
    private String size;
    private String nikname;

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
class Bulldog extends Dog{
    private boolean agressive;
    private String skincolour;

    public boolean isAgressive() {
        return agressive;
    }

    public String getSkincolour() {
        return skincolour;
    }

    public void setAgressive(boolean agressive) {
        this.agressive = agressive;
    }

    public void setSkincolour(String skincolour) {
        this.skincolour = skincolour;
    }
}
class Dachshund extends Dog{
    private String length;
    private boolean friendly;

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}