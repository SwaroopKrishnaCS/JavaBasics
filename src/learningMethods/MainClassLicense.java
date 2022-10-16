package learningMethods;

import java.util.Scanner;

public class MainClassLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter your current License");
		String currentLicense = sc.next();
		
		MethodwithReturnType methodWR = new MethodwithReturnType();
		
		String licenseToBeApplied = methodWR.licenseType(currentLicense);
		
		switch (licenseToBeApplied) {
		case "G1":
			System.out.println("You have to pay $100");			
			break;
		case "G2":
			System.out.println("You have to pay $110");			
			break;
		case "G":
			System.out.println("You have to pay $90");			
			break;
		case "You already have a license":
			System.out.println("Go Home");			
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}

	}

}
