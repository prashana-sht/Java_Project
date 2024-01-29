import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("CalculatorService", calculator);
            System.out.println("Calculator server is running...");
        } catch (RemoteException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
