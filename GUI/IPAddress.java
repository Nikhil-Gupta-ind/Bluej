package GUI;
/**
 * Write a description of class LabelExample2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class IPAddress extends Frame
{
    TextField textField; Label label; Button button;
    IPAddress(){
        textField = new TextField();
        textField.setBounds(50,50,150,20);
        label = new Label();
        label.setBounds(50,100,500,20);
        button = new Button("Find IP");
        button.setBounds(50,150,60,30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    String host = textField.getText();
                    String ip = java.net.InetAddress
                    .getByName(host).getHostAddress();
                    label.setText("IP of "+host+" is: "+ip);
                }
                catch(Exception e){
                    System.out.println("Following error occured, rest fine");
                    e.printStackTrace();
                }
            }
        });
        add(button);add(textField);add(label);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    static public void main(String []ar){
        new IPAddress();
    }
}