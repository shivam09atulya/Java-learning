package filehandling;

import java.io.*;

public class Handling {

    public static void main(String []args)throws Exception {
        File f=new File("D://FileHandling//demo.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Hello my name is Shivam");

        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        System.out.println(str);

    }
}
