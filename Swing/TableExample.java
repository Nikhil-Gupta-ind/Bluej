package Swing;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Write a description of class TableExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TableExample {
    JFrame frame;
    TableExample(){
        frame = new JFrame();
        String data[][] = {{"101","Amit","670000"},
        {"102","Jai","780000"},
        {"101","Sachin","700000"}};
        String column[] = {"ID","Name","Salary"};
        JTable table = new JTable(data,column);
        table.setBounds(30,40,200,300);
        table.setCellSelectionEnabled(true);
        ListSelectionModel select = table.getSelectionModel();
        select.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                String Data = null;
                int[] row = table.getSelectedRow();
                int[] column = table.getSelectedColumn();
                for(int i = 0; i<row.length;i++){
                    for(int j = 0;j<column.length;j++){
                        Data = (String)table.getValueAt(row[i],column[j]);
                    }
                    System.out.println("Table element selected is:"+Data);
                }
            }
        });
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        frame.setSize(300,400);
        frame.setVisible(true);
    }
    public static void main(String ar[]){
        new TableExample();
    }
}