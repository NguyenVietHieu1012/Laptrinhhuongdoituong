package week9;

import java.io.*;
import java.io.IOException;

public class readContentFromFile {
    public static void main(String args[]) {

        try {
            FileInputStream fin = new FileInputStream("week9_folder\\week9.txt");
            DataInputStream din = new DataInputStream(fin);

            while (true) {
                System.out.println(din.readInt());
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
