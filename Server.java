package Cal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) {
		try {
			//tao thanh ghi
			Registry registry = LocateRegistry.createRegistry(367);
			
			//tao object
			CalculatorInterface calculatorSkeleton = new CalculatorImplement();
			
			//dang ky object cho thanh ghi
			registry.rebind("Calculator", calculatorSkeleton);
			
			//waiting
			while(true) {
				System.out.println("Server is running ... ");
				Thread.sleep(5000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
