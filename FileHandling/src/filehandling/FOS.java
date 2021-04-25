package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

class FOS{
    public static void main(String[] args) {
        try{
            File f=new File("D://FileHandling//hello1.txt");
            FileOutputStream fout=new FileOutputStream(f);
            String s="Hello how are you doing";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Success");
        }
    }
}