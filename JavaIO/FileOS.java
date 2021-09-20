package JavaIO;
import java.io.FileOutputStream;

/**
 * Write a description of class FileOS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileOS
{
    static public void main(String ar[]){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\textout.txt");
            fileOutputStream.write(65);
            fileOutputStream.close();
            System.out.println("Success...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}