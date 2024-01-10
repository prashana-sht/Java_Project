package pkg2.pkg5.filecopy;
import java.io.*;
public class FileCopy {

    public static void main(String[] args) {
        String sourceFilePath = "file1.txt"; 
        String destinationFilePath = "file2.txt"; 

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));

            FileWriter writer = new FileWriter(destinationFilePath);

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }
            reader.close();
            writer.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
