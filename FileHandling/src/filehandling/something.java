package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class something{

    public static String fileToString() throws FileNotFoundException {
        String filePath = "D:\\FileHandling\\Example.txt";
        Scanner sc = new Scanner(new File(filePath));
        StringBuffer sb = new StringBuffer();
        String input;
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            sb.append(input);
        }
        return sb.toString();
    }
    public static void main(String args[]) throws FileNotFoundException {
        String contents = fileToString();
        System.out.println("Contents of the file: \n"+contents);

        String strArray[] = contents.split(" ");

        StringBuffer buffer = new StringBuffer();
        System.out.println("New content");
        for(int i = 0; i < strArray.length; i++) {

            buffer.append(strArray[i].toUpperCase());
        }
        String result = buffer.toString();
        System.out.println(result);
    }

}