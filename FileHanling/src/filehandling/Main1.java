package filehandling;
import java.io.*;
public class Main1 {
        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("Student.txt");
                String name="Shivam Atulya";
                String roll="\n1905247";
                String branch="\nComputer Science Engineering";
                String university="\nKalinga Institute Of Industrial Technology\n";
                byte a[]=name.getBytes();//converting string into byte array
                byte b[]=roll.getBytes();
                byte c[]=branch.getBytes();
                byte d[]=university.getBytes();
                fout.write(a);
                fout.write(b);
                fout.write(c);
                fout.write(d);
                fout.close();
                FileInputStream fin=new FileInputStream("Student.txt");
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);}
                fin.close();
                System.out.println("successful run");
            }catch(Exception e){System.out.println(e);}
        }
    }
