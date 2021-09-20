package GUI;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DialogExample
{
    private static Dialog d;
    DialogExample(){
        Frame frame = new Frame();
        d = new Dialog(frame,"Dialog Example",true);
        d.setLayout(new FlowLayout());
        Button button = new Button("OK");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DialogExample.d.setVisible(false);
            }
        });
        d.add(new Label("Click button to continue."));
        d.add(button);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String ar[]){
        new DialogExample();
    }
}