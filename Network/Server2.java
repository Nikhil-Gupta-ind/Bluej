package Network;
import java.net.*;
import java.io.*;
/**
 * Write a description of class Server2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Server2
{
    public static void main(String ar[]) throws Exception{
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while(!str.equals("stop")){
            str = din.readUTF();
            System.out.println("client says: "+str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}