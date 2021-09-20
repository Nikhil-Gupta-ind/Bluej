package Swing;
import javax.swing.*;
import java.awt.*;
public class ProgressBarEx extends JFrame{
    JProgressBar jb;
    int i = 0, num = 0;
    ProgressBarEx(){
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Android Studio 2020.3.1\\png\\Group 2.png");
        setIconImage(icon);
        jb = new JProgressBar(0,2000);
        jb.setBounds(40,40,160,20);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250,150);
        setLayout(null);
    }
    public void iterate(){
        while(i<=2000){
            jb.setValue(i);
            i = i + 20;
            try{
                Thread.sleep(150);
                setLayout(null);
            }catch(Exception e){};
        }
    }
    public static void main(String ar[]){
        ProgressBarEx obj = new ProgressBarEx();
        obj.setVisible(true);
        obj.iterate();
    }
}