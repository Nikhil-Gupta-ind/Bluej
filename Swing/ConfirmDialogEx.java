package Swing;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class ConfirmDialog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConfirmDialogEx extends WindowAdapter
{
    JFrame frame;
    ConfirmDialogEx(){
        frame = new JFrame();
        frame.addWindowListener(this);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
    public void windowClosing(WindowEvent e){
        int a = JOptionPane.showConfirmDialog(frame,"Are you sure?");
        if(a==JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String ar[]){
        new ConfirmDialogEx();
    }
}