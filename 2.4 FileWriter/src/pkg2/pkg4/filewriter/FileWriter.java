package pkg2.pkg4.filewriter;
import java.io.*;
public class FileWriter {

    public static void main(String[] args) {
        String fileContent = "Java Lab Report";
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("file.txt");
            byte[] strToBytes = fileContent.getBytes();
            outputStream.write(strToBytes);
 
        }
 
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
        
        finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException e) {
                    System.out.print(e.getMessage());
                }
            }
        }
    }
}
