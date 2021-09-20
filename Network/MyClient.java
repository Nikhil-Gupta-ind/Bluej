package Network;
import java.net.Socket;
import java.io.*;


/**
 * Write a description of class MyClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyClient
{
    static public void main(String ar[]){
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
