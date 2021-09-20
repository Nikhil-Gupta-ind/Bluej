package GUI;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class CheckboxEx2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckboxEx2
{
    CheckboxEx2(){
        Frame frame = new Frame("CheckBox Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100,100,50,50);
        Checkbox checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100,150,50,50);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(label);
        checkbox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ae){
                label.setText("C++ Checkbox : "+(ae.getStateChange()== 1?"checked":"unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("Java Checkbox :"+(e.getStateChange() == 1? "checked":"unchecked"));
            }  
        });
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    static public void main(String ar[]){
        new CheckboxEx2();
    }
}