package week9;

import java.io.*;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class TestObjectOutputStream {

    public static void main(String args[]) {
        Record r[] = { new Record("john", 5.0F), new Record("mary", 5.5F) , new Record("bob", 4.5F) };

        try {
            FileOutputStream fout = new FileOutputStream("week9_folder\\week9.txt" );
            ObjectOutputStream out = new ObjectOutputStream(fout);

            for (int i=0; i<r.length; i++)
                out.writeObject(r[i]);

            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
