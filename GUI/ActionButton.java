package GUI;
/**
 * Write a description of class ActionButton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class ActionButton
{
    static public void main(String ar[]){
        Frame frame = new Frame("Action Button");
        final TextField textField = new TextField();
        textField.setBounds(50,50,150,20);
        Button button = new Button ("Click here");
        button.setBounds(50,100,60,30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textField.setText("Welcome to javapoint.");
            }
        });
        frame.add(button); frame.add(textField);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
