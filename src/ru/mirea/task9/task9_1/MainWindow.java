package ru.mirea.task9.task9_1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainWindow {
 static int resMad=0;
 static int resMil=0;
 static String winner="None";
 static String lastclick= "None";
 private JLabel Result;
 private JLabel LastScorer;
 private JLabel Winner;
 public  MainWindow(){
  JFrame mainwindow = new JFrame("MainWindow");
  JButton MilanButton = new JButton("Milan");
  JButton MadridButton = new JButton("Madrid");
  Result = new JLabel("Result: "+resMad+"X"+resMil);
  LastScorer = new JLabel("Last Scorer: "+lastclick);
  Winner = new JLabel("Winner: "+winner);
  Result.setBounds(180,0,85,20);
  Winner.setBounds(377,0,150,20);
  LastScorer.setBounds(257,0,150,20);
  MilanButton.setBounds(0, 0, 85, 20);
  MadridButton.setBounds(85, 0, 85, 20);
  mainwindow.add(LastScorer);
  mainwindow.add(MilanButton);
  mainwindow.add(MadridButton);
  mainwindow.add(Result);
  mainwindow.add(Winner);
  MadridButton.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
    MainWindow.resMad++;
    MainWindow.lastclick = "Madrid";
    if (MainWindow.resMad > MainWindow.resMil) {
     MainWindow.winner = "Madrid";
    }
    else {
     if (MainWindow.resMad < MainWindow.resMil) {
      MainWindow.winner = "Milan";
     }
     else {
      MainWindow.winner = "Draw";
     }
    }
    update();
   }
  });
  MilanButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    MainWindow.resMil++;
    MainWindow.lastclick = "Milan";
    if (MainWindow.resMad > MainWindow.resMil) {
     MainWindow.winner = "Madrid";
    }
    else {
     if (MainWindow.resMad < MainWindow.resMil) {
      MainWindow.winner = "Milan";
     }
     else {
      MainWindow.winner = "Draw";
     }
    }
update();
   }
  });
  mainwindow.setSize(700, 700);
  mainwindow.setLayout(null);
  mainwindow.setVisible(true);
 }
 public void update(){
  Winner.setText("Winner: "+winner);
  Result.setText("Result: "+resMad+"X"+resMil);
  LastScorer.setText("Last Scorer: "+lastclick);
 }
}
