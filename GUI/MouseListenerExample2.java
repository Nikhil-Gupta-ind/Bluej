package GUI;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class MouseListenerExample2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MouseListenerExample2 extends Frame implements MouseListener{
    MouseListenerExample2(){
        addMouseListener(this);
        
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent me){
        Graphics graphics = getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.fillOval(me.getX(),me.getY(),30,30);
    }
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public static void main(String ar[]){
        new MouseListenerExample2();
    }
}