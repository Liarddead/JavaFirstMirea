package ru.mirea.task5.task5_3;

import java.util.concurrent.CompletionStage;

public abstract class Furniture {
    private String name;
    private String type;
    private int cost;
public Furniture(String Name, String Type,int Cost){
    name=Name;
    type=Type;
    cost=Cost;
}
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    protected int getCost() {
        return cost;
    }

    protected void setCost(int cost) {
        this.cost = cost;
    }
}

class Table extends Furniture {
    public Table(String Name, String Type, int Cost) {
        super(Name, Type,Cost);
    }
    private String size;
    private String material;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
class Chair extends Furniture {
    public Chair(String Name, String Type,int Cost) {
        super(Name, Type,Cost);
    }
    private String size;
    private String material;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
