package GUI;
/**
 * Write a description of class AEvent3 here.
 * Java event handling by anonymous class
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class AEvent3 extends Frame{
    TextField textField;
    AEvent3(){
        textField = new TextField();
        textField.setBounds(60,50,170,20);
        Button button = new Button("Click me");
        button.setBounds(50,120,80,30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textField.setText("Hello");
            }
        });
        add(button);add(textField);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    static public void main(String ar[]){
        new AEvent3();
    }
}