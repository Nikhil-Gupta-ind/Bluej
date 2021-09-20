package GUI;
/**
 * Write a description of class AEvent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class AEvent extends Frame implements ActionListener{
    TextField textfield;
    AEvent(){
        textfield = new TextField();
        textfield.setBounds(60,50,170,20);
        Button button = new Button("Click me");
        button.setBounds(100,120,80,30);
        button.addActionListener(this);
        add(button);
        add(textfield);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        textfield.setText("Welcome");
    }
    public static void main(String ar[]){
        new AEvent();
    }
}