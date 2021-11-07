package ru.mirea.task11.task11_1;
import javax.swing.JOptionPane;
import java.util.Random;
public class MainWindow {
 public MainWindow() {
  Random r = new Random();
  String input;
  int count = 0;
  int number = r.nextInt(21);
  while (count < 3) {
   input = JOptionPane.showInputDialog("Введите число");
   int inp = Integer.parseInt(input);
   if (number != inp) {
    if (inp > number) {
     count++;
     JOptionPane.showMessageDialog(null, "Число меньше!");
    } else {
     count++;
     JOptionPane.showMessageDialog(null, "Число больше!");
    }
   } else {
    JOptionPane.showMessageDialog(null, "Вы выиграли!");
    break;
   }
   if (count == 3) {
    JOptionPane.showMessageDialog(null, "Вы проиграли!");
    break;
   }
  }
 }
}