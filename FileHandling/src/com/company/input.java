package com.company;

import java.io.File;
import java.io.FileInputStream;

public class input {
    public static void main(String[] args) {
        try{
            File f=new File("D://FileHandling//hello1.txt");
            FileInputStream fin=new FileInputStream(f);
            int i=0;
            while((i=fin.read())!=-1){
                System.out.println((char)i);
                fin.close();
                i++;
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
