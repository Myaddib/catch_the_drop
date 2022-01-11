package geekbrins.ru;

import javax.swing.*;
import java.awt.*;

public class GameWindows extends JFrame {

    // write your code here
    public static void main(String[] args) {
        GameWindows game_windows = new GameWindows();
        game_windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_windows.setLocation(200,100);
        game_windows.setSize(906,487);
        game_windows.setResizable(false);

        GameField game_Field = new GameField();
        game_windows.add(game_Field);

        game_windows.setVisible(true);
    }

    private static void onRepaint(Graphics g) { // рисовать
        g.fillOval(10, 10, 200, 100); //овал
        g.drawLine(50, 30, 350, 500); // линия раз
        g.drawLine(45, 40, 275, 431); // линия дваз
    }

    private static class GameField extends JPanel { //класс понели

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //сначало он
            onRepaint(g);
        }
    }
}