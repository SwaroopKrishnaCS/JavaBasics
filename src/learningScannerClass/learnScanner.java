package learningScannerClass;

import java.util.Scanner;

public class learnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get input from runtime
		//Create a variable for Scanner Class
		int num1 = 0;
		int num2 = 0;
		String name = "";
		double interestRate = 0.0;
		
		//Use scanner to read from System.in
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		int num3 = num1+num2;
		System.out.println(num3);
		
		System.out.println("Enter your name");
		
		//Get String value from console
		name = sc.next();
		System.out.println(name);
		
		
		System.out.println("Enter the current interest rate provided by your bank");
		
		interestRate = sc.nextDouble();
		System.out.println(interestRate);
		
		

	}

}
