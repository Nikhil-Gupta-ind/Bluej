package Swing;
import javax.swing.*;

/**
 * Write a description of class OptionPaneExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OptionPaneExample
{
    JFrame frame;
    OptionPaneExample(){
        frame = new JFrame();
        String name = JOptionPane.showInputDialog(frame,"Enter Name");
    }
    public static void main(String ar[]){
        new OptionPaneExample();
    }
}