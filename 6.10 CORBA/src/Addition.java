
import java.rmi.*;
public interface Addition extends Remote {
	public int AddValue(int a,int b ) throws RemoteException;
}
