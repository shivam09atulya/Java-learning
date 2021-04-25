package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter{
    public static void main(String [] args)
    {
        try {
            FileWriter myWriter = new FileWriter("D:\\FileHandling\\Student.txt");
            myWriter.write("Roll:1905247 \n Name:Shivam \n Branch:CSE \n University:KIIT");
            myWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
