package GUI;
/**
 * Write a description of class First2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class First2
{
    First2(){
        Frame frame = new Frame();
        Button button = new Button("Click me");
        button.setBounds(30,50,80,30);
        frame.add(button);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String ar[]){
        First2 first = new First2();
    }
}
