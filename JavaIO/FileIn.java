package JavaIO;
import java.io.FileInputStream;

/**
 * Write a description of class FileIn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileIn
{
    static public void main(String ar[]){
        try{
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while((i = fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}