package JavaIO;
import java.io.FileOutputStream;

/**
 * Write a description of class FileOut here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileOut
{
    static public void main(String ar[]) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\testout.text");
        String s = "Welcome to java";
        byte b[] = s.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.close();
        System.out.println("success...");
    }
}