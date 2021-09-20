package GUI;
import java.awt.*;

/**
 * Write a description of class TextAreaEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextAreaEx
{
    TextAreaEx(){
        Frame frame = new Frame();
        TextArea area = new TextArea("Welcome to java");
        area.setBounds(10,30,900,500);
        frame.add(area);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    static public void main(String ar[]){
        new TextAreaEx();
    }
}