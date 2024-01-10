/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ChatClient {
    public static void main(String[] args) throws IOException {
        new ChatClient().startClient("localhost", 8080);
    }

    public void startClient(String host, int port) throws IOException {
        Socket socket = new Socket(host, port);
        System.out.println("Connected to the server");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String clientName = scanner.nextLine();
        socket.getOutputStream().write(clientName.getBytes());

        new Thread(() -> {
            try {
                InputStream inputStream = socket.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(reader);

                while (true) {
                    String message = bufferedReader.readLine();
                    if (message == null) {
                        break; // Server disconnected
                    }

                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        try (OutputStream outputStream = socket.getOutputStream()) {
            while (true) {
                String message = scanner.nextLine();
                outputStream.write((message + "\n").getBytes());
            }
        }
    }
}
