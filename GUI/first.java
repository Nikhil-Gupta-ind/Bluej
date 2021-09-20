package GUI;
/**
 * Write a description of class first here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class first extends Frame
{
    first(){
        Button button = new Button("Click me");
        button.setBounds(30,100,80,30);
        add(button);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    static public void main(String ar[]){
        first f = new first();
    }
}