package Cal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			// tim kiem thanh ghi
			Registry registry = LocateRegistry.getRegistry("localhost",367);

			// tim kiem dua tren ten bien Object
			CalculatorInterface cal = (CalculatorInterface) registry.lookup("Calculator");

			// excute
			Scanner sc = new Scanner(System.in);
			while (true) {
				int choice;
				System.out.println("Pick a number of choices : ");
				System.out.println("1. Add two numbers.");
				System.out.println("2. Subtract two numbers.");
				System.out.println("3. Multiply two numbers.");
				System.out.println("4. Devided two numbers.");
				
				choice = sc.nextInt();
				System.out.println("Input two numbers :");
				System.out.println("----------------------------------------------");
				System.out.println("First number : ");
				double a = sc.nextDouble();
				System.out.println("Second number : ");
				double b = sc.nextDouble();
				
				double result = 0;
				switch (choice) {
				case 1: {
					result = cal.add(a, b);
					break;
				}
				case 2: {
					result = cal.subtract(a, b);
					break;
				}
				case 3: {
					result = cal.multiply(a, b);
					break;
				}
				case 4: {
					result = cal.divide(a, b);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				
				System.out.println("Your anser is " + result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
