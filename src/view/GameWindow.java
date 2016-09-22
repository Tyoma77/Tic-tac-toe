package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by artem on 22.09.2016.
 * Работа с графикой
 */
public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {
        setSize(400, 400);  //задаем размер
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    // когда закрываем, программа останавливается
        setTitle("Tic Tac Toe");    //называем окно
        jPanel.setLayout(new GridLayout(3, 3));     //табличная расстановка
        setLocationRelativeTo(null);    //размещаем по центру

        for ( int i = 0; i < buttons.length; i++ ) {    //заполняем панель кнопками
            JButton[] buttonLine = buttons[i];
            for ( int j = 0; j < buttonLine.length; j++ ) {
                JButton jButton = new JButton();
                buttons[i][j] = jButton;
                jButton.addActionListener(new ActionListener() {    //делаем кнопки нажимаемыми
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = e.getActionCommand();    //получаем какая кнопка нажата на кнопке

                    }
                });

                jPanel.add(jButton);
            }

        }

        add(jPanel);
        setVisible(true);   //делаем видимой программу
    }
}
