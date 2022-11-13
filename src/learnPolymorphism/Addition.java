package learnPolymorphism;

public class Addition {
	
	
	
	public void additionOfNumbers(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		System.out.println("Sum of the numbers is "+sum);
	}
	
	
	public void additionOfNumbers(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum of the numbers is "+sum);
	}
	
	public void validateLogin(String password) {
		System.out.println("Password validated opening Windows");
	
	}
	
	public void validateLogin(int pin) {
				
		System.out.println("PIN validated opening Windows");
	}
	
	
	public void validateLogin(String password, int pin) {
		System.out.println("PIN and Pass Entered");
	}
	
	public void validateLogin(int pin, String password) {
		System.out.println("Pass and PIN Entered");
	}
	
	

}
