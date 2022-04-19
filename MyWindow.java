package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
        // Окно Window c кнопками button1 и button2 справа и слева


        /*setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton button1 = new JButton("Simple Button #1");
        JButton button2 = new JButton("Simple Button #2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true);*/


        // Окно BoxLayoutDemo с кнопками по горизонтали

       /* setBounds(500, 500, 500, 300);
        setTitle("BoxLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for (int i = 1; i <= 10; i++) {
            add(new JButton("#" + i));
        }
        setVisible(true);*/


        // Окно FlowLayoutDemo с кнопками в одну строку и переходом на следующую

        /*setBounds(500, 500, 500, 300);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        for (int i = 1; i <= 100; i++) {
            add(new JButton("#" + i));
        }
       setVisible(true); */

        // Окно "GridLayoutDemo с таблицей

        /*setBounds(500, 500, 400, 300);
        setTitle("GridLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 12; i++) {
            add(new JButton(String.valueOf(i + 1)));
        }
        setVisible(true);*/

        // Отключение компоновщика элементов

        /*setBounds(500,500,300,300);
        setTitle("Manual GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 32);
        add(field);
        JButton button = new JButton("Нажми сюда");
        button.setBounds(20, 60, 120, 32);
        add(button);
        setVisible(true);*/


        // Обработка кликов по кнопке -установка слушателей событий

        /*setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Нажми сюда!");
        add(button, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Нажал!");
            }
        });
        setVisible(true);*/

        // Обработка нажатия Enter в текстовом поле

        /*setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(textField.getText());
            }
        });
        setVisible(true);*/

        // Отслеживание момента закрытия окна

        /*setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается");
            }
        });
        setVisible(true);*/


        // Базовые элементы управления
       /* JFrame – окно приложения;
● JButton – кнопка;
● JLabel – надпись;
● JTextField – однострочное текстовое поле;
● JTextArea – многострочное текстовое поле;
● JScrollPane – контейнер для пролистывания контента;
● JMenuBar – верхнее меню программы;
● JTable – таблица;
● JRadioButton – RadioButton;
● JCheckBox – CheckBox.*/


    }
}
