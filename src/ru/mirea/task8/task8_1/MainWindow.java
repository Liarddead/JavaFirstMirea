package ru.mirea.task8.task8_1;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
public class MainWindow extends JFrame {
    protected int X;
    protected  int Y;
    protected int WDT;
    protected  int HGT;
    protected int number;
    RandomGeneration p= new RandomGeneration();
    MainWindow() {
        super("Main window");
        setSize(1920, 1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint (Graphics g){
        for (int i=0;i<20;i++) {
            p.RandomShape();
            if (p.getNumber() > 0) {
                g.setColor(p.ColourGeneration());
                g.drawRect(p.getX(), p.getY(), p.getWDT(), p.getHGT());
                g.fillRect(p.getX(), p.getY(), p.getWDT(), p.getHGT());
            } else {
                g.setColor(p.ColourGeneration());
                g.drawOval(p.getX(), p.getY(), p.getWDT(), p.getHGT());
                g.fillOval(p.getX(), p.getY(), p.getWDT(), p.getHGT());
            }
        }
    }

}