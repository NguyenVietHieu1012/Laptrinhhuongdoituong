package week9;
import java.io.File;
import java.util.Scanner;
import java.net.URL;
import java.io.*;
public class TestInputStream {
    public static void main(String []args){
        File f = new File("week9_folder");
        String[] subFiles = f.list();
        for (int i = 0; i < subFiles.length; i++) {
            File subFile = new File("week9_folder\\" + subFiles[i]) ;
            if (subFile.isDirectory()) {
                String[] subFiles2 = subFile.list();
                for (int j = 0; j < subFiles2.length; j++) {
                    System.out.println(subFiles2[j]);
                }
            } else {
                System.out.println(subFiles[i]);
            }
        }
    }
}
