package GUI;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;  
import java.awt.event.*;  
public class MouseMotionListenerExample extends Frame implements MouseMotionListener{  
    MouseMotionListenerExample(){  
        addMouseMotionListener(this);  
          
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();  
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}  
public void mouseMoved(MouseEvent e) {}  
  
public static void main(String[] args) {  
    new MouseMotionListenerExample();  
}  
}  