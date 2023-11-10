package week9;
import java.io.*;
import java.io.File;

public class Copyfile {
    public static void main(String[] args) {
        File f = new File("week9_folder\\week9.txt");
        File fCopy = new File("week9_folder\\week9copy.txt");
        try {
            FileReader src = new FileReader(args[0]);
            FileWriter des = new FileWriter(args[1]);
            char buf[] = new char[128];
            int charsRead;
            charsRead = src.read(buf);
            while (charsRead != -1) {
                des.write(buf, 0, charsRead);
                charsRead = src.read(buf);
            }
            src.close();
            des.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
