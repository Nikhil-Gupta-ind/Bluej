package Network;
/**
 * Write a description of class MyServer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.net.*;
public class MyServer
{
    static public void main(String ar[]){
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("message = "+str);
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}