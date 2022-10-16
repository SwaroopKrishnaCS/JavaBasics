package learningMethods;

public class AccountDetails {

	int a;
	int b;

	int getAccountNumber() {

		return accountNumber;
	}

	boolean isPINNumberValid(int pinEntered) {
		if (pinNumber == pinEntered) {
			
			return true;

		} 
		return false;

	}
	
	int showBalance() {
		
		return a+b;
	}
	
	int accountNumber;
	int pinNumber;

}
