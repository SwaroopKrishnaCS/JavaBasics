package learnAbstractionAbstractClass;

public abstract class BOC {
	
	public void bankAccount() {
		
	}
	
	public void validateUserWithSIN() {
		System.out.println("User validated with SIN");
	}
	
	public abstract void provideCreditCard(int CreditLimit);
	
	public abstract void interestRate();
		
}
