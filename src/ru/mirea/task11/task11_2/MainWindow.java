package ru.mirea.task11.task11_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
public class MainWindow {
 private JLabel West;
 private JLabel East;
 private JLabel North;
 private JLabel South;
 private JLabel Center;
 public MainWindow(){
  JFrame mainwindow = new JFrame("MainWindow");
  West = new JLabel("West");
  East = new JLabel("East");
  North = new JLabel("North");
  South= new JLabel("South");
  Center=new JLabel("Center");
  West.setBounds(0,90,40,500);
  East.setBounds(650,90,40,500);
  North.setBounds(90,0,500,40);
  South.setBounds(90,630,500,40);
  Center.setBounds(310,310,80,80);
  West.addMouseMotionListener(new MouseMotionListener() {
   public void mouseDragged(MouseEvent e) {

   }
   public void mouseMoved(MouseEvent e) {
    JOptionPane.showMessageDialog(null, "Добро пожаловать в West!");
   }
  });
  East.addMouseMotionListener(new MouseMotionListener() {
   public void mouseDragged(MouseEvent e) {}
   public void mouseMoved(MouseEvent e) {
    JOptionPane.showMessageDialog(null, "Добро пожаловать в East!");
   }
  });
  North.addMouseMotionListener(new MouseMotionListener() {
   public void mouseDragged(MouseEvent e) {}
   public void mouseMoved(MouseEvent e) {
    JOptionPane.showMessageDialog(null, "Добро пожаловать в North!");
   }
  });
  South.addMouseMotionListener(new MouseMotionListener() {
   public void mouseDragged(MouseEvent e) {}
   public void mouseMoved(MouseEvent e) {
    JOptionPane.showMessageDialog(null, "Добро пожаловать в South!");
   }
  });
  Center.addMouseMotionListener(new MouseMotionListener() {
   public void mouseDragged(MouseEvent e) {}
   public void mouseMoved(MouseEvent e) {
    JOptionPane.showMessageDialog(null, "Добро пожаловать в Center!");
   }
  });
  Center.setOpaque(true);
  Center.setBackground(Color.MAGENTA);
  Center.setForeground(Color.WHITE);
  Center.setHorizontalAlignment(SwingConstants.CENTER);
  South.setOpaque(true);
  South.setBackground(Color.RED);
  South.setForeground(Color.WHITE);
  South.setHorizontalAlignment(SwingConstants.CENTER);
  North.setOpaque(true);
  North.setBackground(Color.BLUE);
  North.setForeground(Color.WHITE);
  North.setHorizontalAlignment(SwingConstants.CENTER);
  West.setOpaque(true);
  West.setBackground(Color.GREEN);
  West.setForeground(Color.WHITE);
  West.setHorizontalAlignment(SwingConstants.CENTER);
  East.setOpaque(true);
  East.setBackground(Color.YELLOW);
  East.setForeground(Color.BLACK);
  East.setHorizontalAlignment(SwingConstants.CENTER);
  mainwindow.add(Center);
  mainwindow.add(North);
  mainwindow.add(West);
  mainwindow.add(East);
  mainwindow.add(South);
  mainwindow.setSize(700, 700);
  mainwindow.setLayout(null);
  mainwindow.setVisible(true);
 }

}
