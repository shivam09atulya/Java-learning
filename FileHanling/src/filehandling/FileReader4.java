package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader4 {
    public static void main(String[] args)
    {
        try {
        File myObj = new File("D:\\FileHandling\\Question4.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
            catch(
    FileNotFoundException e)
    {
        System.out.println("An error occured");
        e.printStackTrace();
    }


}
}
