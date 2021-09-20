package ru.mirea.task2.task2_1;

public class Shape {
    private String name;
    private String colour;

    public Shape(String Name, String Colour){
         name=Name;
         colour=Colour;
    }
    public void SetName(String Name){
        name= Name;
    }
    public void SetColour(String Colour){
        colour=Colour;
    }
    public String GetName(){
        return name;
    }

    public String GetColour() {
        return colour;
    }
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
