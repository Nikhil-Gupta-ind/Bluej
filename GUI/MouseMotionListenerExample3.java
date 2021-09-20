package GUI;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MouseMotionListenerExample3 extends Frame implements MouseMotionListener{
    Label l;  
    Color c=Color.BLUE;
    MouseMotionListenerExample3(){
        l=new Label(); 
        l.setBounds(20,40,100,20);  
        add(l);
        addMouseMotionListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent me){
        l.setText("X= "+me.getX()+",Y= "+me.getY());
        Graphics graphics = getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.fillOval(me.getX(),me.getY(),10,10);
    }
    public void mouseMoved(MouseEvent me){
        l.setText("X="+me.getX()+"Y="+me.getY());
    }
    public static void main(String ar[]){
        new MouseMotionListenerExample3();
    }
}