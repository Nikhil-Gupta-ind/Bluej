package GUI;
/**
 * Write a description of class ButtonExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class ButtonExample{
    static public void main(String ar[]){
        Frame frame = new Frame("Button Example");
        Button button = new Button("Click here");
        button.setBounds(50,100,80,30);
        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}