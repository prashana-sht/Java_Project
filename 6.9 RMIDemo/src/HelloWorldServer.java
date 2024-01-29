import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class HelloWorldServer implements HelloWorldInterface{
    public HelloWorldServer() throws RemoteException {
        super();
    }

    @Override
    public String getGreeting() throws RemoteException {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        try {
            HelloWorldServer server = new HelloWorldServer();
            HelloWorldInterface stub = (HelloWorldInterface) UnicastRemoteObject.exportObject(server, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("HelloWorld", stub);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
