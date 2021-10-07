
/**
 * Write a description of class Test here.
 * This program demonstrates conversion of datagram packets
 * @author Nikhil Gupta ©2021-22
 * @version (a version number or a date)
 */
import java.net.*;
public class DatagramPacketConversion{
    static public void main(String ar[])throws Exception{
        String str = "Hello";//Sample Data
        System.out.println(str.getBytes()); //check encoding
        System.out.println("Original: "+str);
        InetAddress ip = InetAddress.getByName("127.0.0.1");//Taking IP
        //Creating Datagram packet
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        
        byte[] buf = new byte[1024];//Taking array of 1024 bytes = 1kb
        DatagramPacket dp2 = new DatagramPacket(buf, 1024);//new packet
        dp2=dp;//transfer from 1 packet to another
        str = new String(dp2.getData(), 0, dp2.getLength());//decoding packet
        System.out.println("Decoded Packet: "+str);
    }
}