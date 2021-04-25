package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class handling {
    public static void main(String[] args) {
        try{
            File f= new File("D://FileHandling//some.txt");
            FileOutputStream fout=new FileOutputStream(f);
            String s1="My name is Shivam";
            String s2="My roll no is 1905247";
            String s3="I study in KIIT";
            byte b1[]=s1.getBytes();
            byte b2[]=s2.getBytes();
            byte b3[]=s3.getBytes();
            fout.write(b1);
            fout.write(b2);
            fout.write(b3);
            fout.close();

            FileInputStream fin=new FileInputStream(f);

            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
                fin.close();
            }
        }catch (IOException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.err.println("Exception occured");
        }
        finally {
            System.out.println("Success in handling");
        }
    }

}

