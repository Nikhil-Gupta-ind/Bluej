package JavaIO;
import java.io.FileInputStream;

public class FileIS{
    static public void main(String ar[]){
        try{
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = fin.read();
            System.out.print((char)i);
            fin.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}