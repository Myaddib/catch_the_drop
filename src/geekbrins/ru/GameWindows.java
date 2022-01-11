package geekbrins.ru;

import javax.swing.*;
import java.awt.*;

public class GameWindows extends JFrame {
    private static GameWindows game_windows;

    public static void main(String[] args) {
	// write your code here
        game_windows = new GameWindows();
        game_windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_windows.setLocation(200,100);
        game_windows.setSize(906,487);
        game_windows.setResizable(false);
//        GameField game_Field = new GameField();
//        game_windows.add(game_Field);
        game_windows.setVisible(true);
    }
//    private static void onRepaint(Graphics g){
//        g.fillOval(10,10,200,100);
//    }
//
//    private static class GameField extends JPanel{
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            onRepaint(g);
//        }
//    }
}
