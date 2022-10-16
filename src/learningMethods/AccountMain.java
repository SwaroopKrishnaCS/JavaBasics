package learningMethods;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails accountDetails = new AccountDetails();
		
		int accountNumber = accountDetails.getAccountNumber();
		System.out.println(accountDetails.accountNumber);
		
		System.out.println(accountDetails.showBalance());
		
		System.out.println(accountNumber);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the PIN Number");
		int pinEntered = sc.nextInt();
		
		
		System.out.println(accountDetails.isPINNumberValid(pinEntered));

	}

}
