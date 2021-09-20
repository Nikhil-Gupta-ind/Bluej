package Network;


/**
 * Write a description of class URL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;    
import java.net.*;    
public class URLConnectionExample {    
public static void main(String[] args){    
try{    
URL url=new URL("https://www.javatpoint.com/java-tutorial");    
URLConnection urlcon=url.openConnection();    
InputStream stream=urlcon.getInputStream();    
int i;    
while((i=stream.read())!=-1){    
System.out.print((char)i);    
}    
}catch(Exception e){System.out.println(e);}    
}    
}