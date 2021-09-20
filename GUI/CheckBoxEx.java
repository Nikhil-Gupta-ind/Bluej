package GUI;
import java.awt.*;

/**
 * Write a description of class CheckBoxEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckBoxEx
{
    CheckBoxEx(){
        Frame frame = new Frame("Checkbox Example");
        Checkbox checkbox = new Checkbox("C++");
        checkbox.setBounds(180,100,50,50);
        Checkbox checkbox2 = new Checkbox("java");
        checkbox2.setBounds(180,150,50,50);
        frame.add(checkbox);
        frame.add(checkbox2);
        frame.setSize(4000,840);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    static public void main(String ar[]){
        new CheckBoxEx();
    }
}