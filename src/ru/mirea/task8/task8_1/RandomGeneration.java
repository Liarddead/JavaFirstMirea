package ru.mirea.task8.task8_1;
import java.awt.*;
import java.util.Random;
public class RandomGeneration implements Parametrs {
    protected int X;
    protected  int Y;
    protected int WDT;
    protected  int HGT;
    protected int number;

    public int getY() {
        return Y;
    }

    public int getX() {
        return X;
    }

    public int getHGT() {
        return HGT;
    }

    public int getNumber() {
        return number;
    }

    public int getWDT() {
        return WDT;
    }
Random r= new Random();
    public void RandomShape() {
        number = r.nextInt(3);
        switch (number) {
            case 0:
                int radius = r.nextInt(100) + 10;
                X=r.nextInt(1920);
                Y=r.nextInt(1080);
                Circle ex1 = new Circle(radius, "", true,X,Y);
                WDT=radius;
                HGT=radius;
                break;
            case 1:
                X=r.nextInt(1920);
                Y=r.nextInt(1080);
                int width = r.nextInt(100) + 10;
                int high = r.nextInt(100) + 10;
                Rectangle ex2 = new Rectangle("", true, width,high,X,Y);
                WDT=width;
                HGT=high;
                break;
            case 2:
                X=r.nextInt(1920);
                Y=r.nextInt(1080);
                int side = r.nextInt(100) + 5;
                Square ex3 = new Square("", true, side,X,Y);
                WDT=side;
                HGT=side;
                break;
        }
    }
    protected Color ColourGeneration() {
        int number = r.nextInt(6);
        Color colour;
        switch (number) {
            case 0:
                colour=Color.RED;
                break;
            case 1:
                colour=Color.BLUE;
                break;
            case 2:
                colour=Color.GREEN;
                break;
            case 3:
                colour= Color.YELLOW;
                break;
            case 4:
                colour= Color.ORANGE;
                break;
            case 5:
                colour= Color.CYAN;
                break;
            case 6:
                colour=Color.MAGENTA;
                break;
            default:
                colour=Color.BLUE;
        }
        return colour;
    }
}
