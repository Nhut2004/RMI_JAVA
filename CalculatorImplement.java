package Cal;

import java.io.Serializable;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImplement extends UnicastRemoteObject implements CalculatorInterface, Serializable{

	protected CalculatorImplement() throws RemoteException {
	
	}

	@Override
	public double add(double a, double b) throws RemoteException {
		
		return a+b;
	}

	@Override
	public double subtract(double a, double b) throws RemoteException {
		
		return a-b;
	}

	@Override
	public double multiply(double a, double b) throws RemoteException {
		
		return a*b;
	}

	@Override
	public double divide(double a, double b) throws RemoteException {
		if(b==0) 
			System.err.println("Error");
		return a/b;
	}
	
}
