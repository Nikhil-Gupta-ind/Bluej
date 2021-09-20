package Network;
import java.net.*;
import java.io.*;
/**
 * Write a description of class Client2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client2
{
    static public void main(String ar[])throws Exception{
        Socket s = new Socket("localhost",3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "",str2 = "";
        while(!str.equals("stop")){
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server says: "+str2);
        }
        dout.close();
        s.close();
    }
}