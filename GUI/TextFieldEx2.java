package GUI;


/**
 * Write a description of class TextFieldEx2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class TextFieldEx2 extends Frame implements ActionListener
{
    TextField textField,textField2,textField3;
    Button button, button2;
    TextFieldEx2(){
        textField = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        button = new Button("+");
        button2 = new Button("-");
        textField.setBounds(50,50,150,20);
        textField2.setBounds(50,100,150,20);
        textField3.setBounds(50,150,150,20);
        textField3.setEditable(false);
        button.setBounds(50,200,50,50);
        button2.setBounds(120,200,50,50);
        textField.addActionListener(this);
        button.addActionListener(this);
        button2.addActionListener(this);
        add(textField);
        add(textField2);
        add(textField3);
        add(button);
        add(button2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String s1 = textField.getText();
        String s2 = textField2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if(ae.getSource() == button){
            c=a+b;
        }
        else if(ae.getSource() == button2){
            c=a-b;
        }
        String result = String.valueOf(c);
        textField3.setText(result);
        
    }
    static public void main(String ar[]){
        new TextFieldEx2();
    }
}