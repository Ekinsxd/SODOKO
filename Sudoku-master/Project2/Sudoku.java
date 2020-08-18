package Project2;

import javax.swing.*;

public class Sudoku {

    private static int size;
    private static int timeLimit;

    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Shitty Sudoku");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        SudokuPanel panel = new SudokuPanel();

        frame.getContentPane().add(panel);
        frame.setAlwaysOnTop(true);

        frame.setSize(600,650);
        frame.setVisible(true);
    }



}

