package Cal;

import java.rmi.Remote;
import java.rmi.*;

public interface CalculatorInterface extends Remote {
	public double add(double a, double b) throws RemoteException;

	public double subtract(double a, double b) throws RemoteException;

	public double multiply(double a, double b) throws RemoteException;

	public double divide(double a, double b) throws RemoteException;

}
