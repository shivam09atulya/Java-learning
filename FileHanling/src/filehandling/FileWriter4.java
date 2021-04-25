package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter4 {
    public static void main(String [] args)
    {
        try {
            FileWriter myWriter = new FileWriter("D:\\FileHandling\\example.txt");
            myWriter.write("My name is @ shivam and @@ i study @ in kiit");
            myWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
