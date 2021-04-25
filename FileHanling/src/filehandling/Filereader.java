package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Filereader {
    public static void main(String [] args)
    {
        try {
            File myObj = new File("D:\\FileHandling\\Student.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }
            catch(FileNotFoundException e)
            {
                System.out.println("An error occured");
                e.printStackTrace();
            }


    }
}
