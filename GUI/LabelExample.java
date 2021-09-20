package GUI;


/**
 * Write a description of class LabelExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class LabelExample
{
    static public void main(String ar[]){
        Frame frame = new Frame("Label Example");
        Label label,label2;
        label = new Label("First Label.");
        label.setBounds(50,100,100,30);
        label2 = new Label("Second Label.");
        label2.setBounds(50,150,100,30);
        frame.add(label);
        frame.add(label2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
