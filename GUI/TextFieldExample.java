package GUI;


/**
 * Write a description of class TextFieldExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class TextFieldExample
{
    static public void main(String []ar){
        Frame frame = new Frame("TextField Example");
        TextField textField,textField2;
        textField = new TextField("Welcome to java");
        
        textField2 = new TextField("AWT package");
        textField.setBounds(50,100,200,30);
        textField2.setBounds(50,150,200,30);
        frame.add(textField);frame.add(textField2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}