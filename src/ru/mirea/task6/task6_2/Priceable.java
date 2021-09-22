package ru.mirea.task6.task6_2;

import javax.xml.namespace.QName;

public interface Priceable {
     String getPrice();
}

class Food implements Priceable{
    private String name;
    private String price;
    public String getPrice() {
        return price+" тубриков" ;
    }
public Food(String Name, String Price){
        name=Name;
        price=Price;
}

}

class Car implements Priceable{
    private String name;
    private String price;
    public String getPrice() {
        return price+" червонцев" ;
    }
    public Car(String Name, String Price){
        name=Name;
        price=Price;
    }

}


class Tools implements Priceable{
    private String name;
    private String price;
    public String getPrice() {
        return price+" рубинов" ;
    }
    public Tools(String Name, String Price){
        name=Name;
        price=Price;
    }

}



