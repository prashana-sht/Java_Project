import java.rmi.Naming;

public class AddClient {	
	public static void main(String args[])  {						
		   try {
			   Addition a = (Addition) Naming.lookup(
                                   "rmi://localhost:1099/localService"
                           );

	            int sum = a.AddValue(3, 4);
	            System.out.println("Sum is " + sum);
	        } catch (Exception e) {
	            System.out.println("Error in ClientAdd: " + e.getMessage());
	        }				
	}
}
