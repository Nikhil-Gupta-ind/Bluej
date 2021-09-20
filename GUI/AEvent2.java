package GUI;
/**
 * Write a description of class AEvent2 here.
 * Java event handling by other class (named Outer here)
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
class Outer implements ActionListener{
    AEvent2 obj;
    Outer(AEvent2 obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.textField.setText("Welcome");
    }
}
public class AEvent2 extends Frame{
    TextField textField;
    AEvent2(){
        textField = new TextField();
        textField.setBounds(60,50,170,20);
        Button button = new Button("Click me");
        button.setBounds(100,120,80,30);
        Outer outer = new Outer(this);
        button.addActionListener(outer);
        add(button);
        add(textField);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String ar[]){
        new AEvent2();
    }
}