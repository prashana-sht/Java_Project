import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class AddServer {
	
	public static void main(String args[]) throws RemoteException, MalformedURLException {
		try {
			Addition ad = new AdditionImp();	        
	         LocateRegistry.createRegistry(1099);

	         Naming.rebind("localService", ad);
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}			
	}
}
