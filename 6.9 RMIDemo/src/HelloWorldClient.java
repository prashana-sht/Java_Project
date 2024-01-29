import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry(null);

            // Lookup the remote object "HelloWorld"
            HelloWorldInterface stub = (HelloWorldInterface) registry.lookup("HelloWorld");

            // Call the remote method
            String response = stub.getGreeting();

            // Display the response
            System.out.println("Response from Server: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
