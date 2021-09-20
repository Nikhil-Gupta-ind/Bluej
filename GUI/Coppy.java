package GUI;


/**
 * Write a description of class N here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;

public class Coppy {

    Coppy(){
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\pngegg.png");
        Frame frame = new Frame("Untitled - Coppy");
        frame.setIconImage(icon);
        //Menu Bar
        MenuBar menuBar = new MenuBar();
        //File Menu
        Menu file = new Menu("File");
        MenuItem f1=new MenuItem("New                Ctrl+N");
        MenuItem f2=new MenuItem("New Window   Ctrl+Shift+N");
        MenuItem f3=new MenuItem("Open               Ctrl+O");
        MenuItem f4=new MenuItem("Save               Ctrl+S");
        MenuItem f5=new MenuItem("Save As      Ctrl+Shift+S");
        MenuItem f6=new MenuItem("Page Setup...            ");
        MenuItem f7=new MenuItem("Print...          Ctrl+P ");
        MenuItem f8=new MenuItem("Exit                     ");
        file.add(f1);
        file.add(f2);
        file.add(f3);
        file.add(f4);
        file.add(f5);
        file.add(f6);
        file.add(f7);
        file.add(f8);
        //Edit menu
        Menu edit=new Menu("Edit");
        MenuItem e1=new MenuItem("Undo");
        MenuItem e2=new MenuItem("Cut");
        MenuItem e3=new MenuItem("Copy");
        MenuItem e4=new MenuItem("Paste");
        MenuItem e5=new MenuItem("Delete");
        MenuItem e6=new MenuItem("Search with Bing...");
        MenuItem e7=new MenuItem("Find");
        MenuItem e8=new MenuItem("Find Next");
        MenuItem e9=new MenuItem("Find Previous");
        MenuItem e10=new MenuItem("Replace...");
        MenuItem e11=new MenuItem("Goto...");
        MenuItem e12=new MenuItem("Select All");
        MenuItem e13=new MenuItem("Time/Date");
        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        edit.add(e4);
        edit.add(e5);
        edit.add(e6);
        edit.add(e7);
        edit.add(e8);
        edit.add(e9);
        edit.add(e10);
        edit.add(e11);
        edit.add(e12);
        edit.add(e13);
        //Format menu
        Menu format=new Menu("Format");
        MenuItem ft1=new MenuItem("Word Wrap");
        MenuItem ft2=new MenuItem("Font...");
        format.add(ft1);
        format.add(ft2);
        //View menu
        Menu view=new Menu("View");
        Menu zoom=new Menu("Zoom");
        MenuItem z1=new MenuItem("Zoom In                        ");
        MenuItem z2=new MenuItem("Zoom Out                       ");
        MenuItem z3=new MenuItem("Restore Default Zoom     Ctrl+0");
        MenuItem v1=new MenuItem("Status Bar");
        view.add(zoom);
        view.add(v1);
        zoom.add(z1);
        zoom.add(z2);
        zoom.add(z3);
        //Help menu
        Menu help=new Menu("Help");
        MenuItem h1=new MenuItem("View Help");
        MenuItem h2=new MenuItem("Send Feedback");
        MenuItem h3=new MenuItem("About Notepages");
        help.add(h1);
        help.add(h2);
        help.add(h3);

        //file.add(submenu);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(view);
        menuBar.add(help);

        TextArea textArea = new TextArea();
        textArea.setBounds(7,50,1009,712);
        frame.setMenuBar(menuBar);
        frame.add(textArea);
        frame.setSize(1024,768);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Coppy();
    }
}
