package ru.mirea.task5.task5_1;
public abstract class Dish {
    private String name;
    private String function;
    public String getName(){return name;}
    public String getFunction(){return function;}
    public Dish(String Name, String Function){
        name=Name;
        function=Function;
    }
};
class Plate extends Dish {
    private String size;
    private int cost;
    public String getSize(){return size;}
    public int getCost(){return cost;}
    public Plate(String Name, String Function) {
        super(Name,Function);
    }
    public void setSize(String Size){size=Size;}
    public void setCost(int Cost){cost=Cost;}
}

class Spoon extends Dish {
    private String material;
    private int length;
    public String getMaterial(){return material;}
    public int getLength(){return length;}
    public Spoon(String Name,String Function) {
        super(Name, Function);
    }
    public void setMaterial(String Material){material=Material;}
    public void setLength(int Length){length=Length;}
}

class Cup extends Dish {
    private String colour;
    private int high;
    public String getColour(){return colour;}
    public int getHigh(){return high;}
    public Cup(String Name,String Function) {
        super(Name, Function);
    }
    public void setColour(String Colour){colour=Colour;}
    public void setHigh(int High){high=High;}
}

