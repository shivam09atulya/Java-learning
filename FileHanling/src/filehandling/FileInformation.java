package filehandling;

import javax.swing.plaf.metal.MetalLookAndFeel;
import java.io.File;
public class FileInformation {
    public static void main(String[] args)
    {
        File myObj=new File("D:\\FileHandling\\Filef1.txt");
        if(myObj.exists())
        {
            System.out.println("File Name: "+ myObj.getName());
            System.out.println("Absolute path: "+ myObj.getAbsolutePath());
            System.out.println("Writeable: "+ myObj.canWrite());
            System.out.println("Readable:"+myObj.canRead());
            System.out.println("File size in bytes "+ myObj.length());

        }
        else {
            System.out.println("File does not exist.");
        }
    }
}
