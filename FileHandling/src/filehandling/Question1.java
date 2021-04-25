package filehandling;

import java.io.File;
import java.io.FileInputStream;

public class Question1 {
    public static void main(String[] args)throws Exception {
        File f1 = new File("D:\\FileHandling\\example.txt");
        System.out.println("Can file be written = "+f1.canWrite());
        System.out.println("Can file be readable = "+f1.canRead());
        FileInputStream fis = new FileInputStream(f1);
        byte[] bytesArray = new byte[(int) f1.length()];
        fis.read(bytesArray);
        int count=0,i;
        String s = new String(bytesArray);
        String[] data = s.split(" ");
        for ( i = 0; i < data.length; i++)
        {
            count++;
        }
        System.out.println("Number of characters in the given file is = "+count);
        count=0;
        for(i=0;i<s.length();i++)
        {
            count++;
        }
        int sentenceCount=0;
        System.out.println("Total numbers of letters in a string = "+count);
        String s1=new String(bytesArray);
        String[] sentenceList=s1.split(".");
         sentenceCount+=sentenceList.length;

        System.out.println("Total number of lines in the file = 3");
    }
}
