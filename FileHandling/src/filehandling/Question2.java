package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Question2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin=new FileInputStream("D:\\FileHandling\\C.txt");
        FileOutputStream fout=new FileOutputStream("D:\\FileHandling\\M.txt");
        int i=0;
        while((i=fin.read())!=-1)
        {
            fout.write((byte)i);
            System.out.print((char) i);
        }

    }
}
