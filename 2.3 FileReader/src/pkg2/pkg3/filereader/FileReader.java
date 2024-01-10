package pkg2.pkg3.filereader;
import java.io.*;
import java.util.Scanner;
public class FileReader {

    public static void main(String[] args) throws Exception {
          File file = new File(
            "C:\\Users\\user\\Desktop\\test.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
