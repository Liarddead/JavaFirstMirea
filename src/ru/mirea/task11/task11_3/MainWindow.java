package ru.mirea.task11.task11_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//
public class MainWindow {
    JTextField TextField;

    public MainWindow() {
        JFrame mainwindow = new JFrame("MainWindow");
        mainwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TextField = new JTextField("Введите текст", 25);
        TextField.setFont(new Font("Dialog", Font.PLAIN, 14));
        TextField.setHorizontalAlignment(JTextField.LEFT);
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Font font = new Font("Verdana", Font.PLAIN, 11);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Menu");
        fileMenu.setFont(font);

        JMenu fontsMenu = new JMenu("Fonts");
        fontsMenu.setFont(font);
        fileMenu.add(fontsMenu);

        JMenuItem FontOne = new JMenuItem("Little");
        FontOne.setFont(font);
        fontsMenu.add(FontOne);
        FontOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setFont(new Font("Dialog", Font.TRUETYPE_FONT, 10));
            }
        });

        JMenuItem FontTwo = new JMenuItem("Bold");
        FontTwo.setFont(font);
        fontsMenu.add(FontTwo);
        FontTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setFont(new Font("", Font.BOLD, 14));
            }
        });

        JMenuItem FontThree = new JMenuItem("Italic");
        FontThree.setFont(font);
        fontsMenu.add(FontThree);
        FontThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setFont(new Font("", Font.ITALIC, 14));
            }
        });

        JMenu ColoursMenu = new JMenu("Colours");
        ColoursMenu.setFont(font);
        fileMenu.add(ColoursMenu);


        JMenuItem ColourOne = new JMenuItem("Red");
        ColourOne.setFont(font);
        ColoursMenu.add(ColourOne);
        ColourOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setForeground(Color.RED);
            }
        });

        JMenuItem ColourTwo = new JMenuItem("Blue");
        ColourTwo.setFont(font);
        ColoursMenu.add(ColourTwo);
        ColourTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setForeground(Color.BLUE);
            }
        });

        JMenuItem ColourThree = new JMenuItem("Green");
        ColourThree.setFont(font);
        ColoursMenu.add(ColourThree);
        ColourThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setForeground(Color.GREEN);
            }
        });
        JMenuItem Default = new JMenuItem("Default");
        Default.setFont(font);
        fileMenu.add(Default);
        Default.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextField.setFont(new Font("Dialog", Font.PLAIN, 14));
                TextField.setForeground(Color.black);
            }
        });

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        menuBar.add(fileMenu);

        mainwindow.setJMenuBar(menuBar);
        contents.add(TextField);
        // Определяем размер окна и выводим его на экран
        mainwindow.setContentPane(contents);
        mainwindow.setSize(700, 700);
        mainwindow.setVisible(true);

    }
}