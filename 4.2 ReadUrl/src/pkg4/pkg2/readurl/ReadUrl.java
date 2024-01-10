package pkg4.pkg2.readurl;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class ReadUrl {

    public static void main(String[] args) {
        String urlString = "https://www.example.com";

        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();

            try (BufferedReader reader = new BufferedReader
                    (new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
