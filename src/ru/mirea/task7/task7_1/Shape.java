package ru.mirea.task7.task7_1;
public abstract class Shape {
    protected String colour;
    protected boolean filled;
    public Shape(){
        colour="Blue";
        filled=true;
    }
    public Shape(String colour, boolean filled) {
this.colour=colour;
this.filled=filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius=1;
        colour="Blue";
        filled=true;
    }
    public Circle(double radius){
        this.radius=radius;
        colour="Blue";
        filled=true;
    }
    public Circle(double radius,String colour, boolean filled){
        this.radius=radius;
        this.colour=colour;
        this.filled=filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double Area = Math.PI* (Math.pow(radius, 2));
        return Area;
    }
    public double getPerimeter() {
        double Perimeter=Math.PI*2;
        return Perimeter;
    }
    public String toString() {
        return "Circle{" + "colour"+colour+
                "filled=" + filled + "radius"+ radius+
                '}';
    }
}
class Rectangle extends Shape{
 protected double width;
 protected double length;
 public Rectangle(){
     colour="blue";
     filled=true;
     width=0;
     length=0;
 }
    public Rectangle(double width,double length){
        colour="blue";
        filled=true;
        this.width=width;
        this.length=length;
    }
    public Rectangle(String colour,boolean filled,double width,double length){
        this.colour=colour;
        this.filled=filled;
        this.width=width;
        this.length=length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
     double Area=length*width;
        return Area;
    }
    public double getPerimeter() {
     double Perimeter=2*(width+length);
        return Perimeter;
    }
    public String toString() {
        return "Rectangle{" + "colour"+colour+
                "filled=" + filled +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
class Square extends Rectangle{
    public Square(){
        colour="blue";
        filled=true;
        width=0;
        length=0;
    }
    public Square(double Side){
        colour="blue";
        filled=true;
        width=Side;
        length=Side;
    }
    public Square(String colour,boolean filled,double Side){
        this.colour=colour;
        this.filled=filled;
        width=Side;
        length=Side;
    }
    public void setSide(double Side){
        width=Side;
        length=Side;
    }
    public double getSide(){
        return length;
    }

    public void setLength(double Side) {
        width=Side;
        length=Side;
    }
    public void setWidth(double Side) {
        width=Side;
        length=Side;
    }
    public String toString() {
        return "Square{" + "colour"+colour+
                "filled=" + filled +
                "Side="+length+
                '}';
    }
}