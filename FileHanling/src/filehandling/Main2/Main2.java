package filehandling.Main2;
import java.io.*;

public class Main2{
        public static void main(String args[]){
            try{
                FileWriter fout=new FileWriter("D:\\FileHandling\\Student.txt");
                fout.write("Name=Shivam Atulya\nRoll=1905247\nBranch=Computer Science Engineering\nUniversity=Kalinga Institute Of Industrial hello Technology \n");
                fout.close();
                FileReader fin=new FileReader("Student.txt");
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);}
                fin.close();
                System.out.println("successful");
            }catch(Exception e){System.out.println(e);}
        }
    }

