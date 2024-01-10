/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg3.chatserver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class ChatServer {
    private List<ClientHandler> clients = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ChatServer().startServer(8080);
    }

    public void startServer(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket);

                ClientHandler clientHandler = new ClientHandler(clientSocket, this);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(sender.getClientName() + ": " + message);
            }
        }
    }

    public void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
        System.out.println("Client disconnected: " + clientHandler.getClientName());
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private ChatServer server;
    private InputStream inputStream;
    private OutputStream outputStream;
    private String clientName;

    public ClientHandler(Socket clientSocket, ChatServer server) {
        this.clientSocket = clientSocket;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            inputStream = clientSocket.getInputStream();
            outputStream = clientSocket.getOutputStream();

            // Set up a simple handshake to get the client name
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            clientName = new String(buffer, 0, bytesRead);

            System.out.println("Client connected: " + clientName);

            // Notify other clients about the new connection
            server.broadcastMessage(clientName + " joined the chat.", this);

            // Read and broadcast messages
            while (true) {
                bytesRead = inputStream.read(buffer);
                if (bytesRead == -1) {
                    break; // Client disconnected
                }

                String message = new String(buffer, 0, bytesRead);
                server.broadcastMessage(message, this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            server.removeClient(this);
            server.broadcastMessage(clientName + " left the chat.", this);
        }
    }

    public void sendMessage(String message) throws IOException {
        outputStream.write(message.getBytes());
    }

    public String getClientName() {
        return clientName;
    }
}
