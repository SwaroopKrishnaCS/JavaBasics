package learnConstructors;

public class AccountDetailswithConstr {
	
	String accountNumber = "51111111111111111";
	String nameOnAcount;
	int pIN;
	double balance;
	
	//Constructor always have the same name as class but with method brackets
	//Always invoked when object is created
	//does not have any return type
	//non parameterized constructor
//	AccountDetailswithConstr() {
//		System.out.println("This is Constructor");
//	}
	
	void updateBalance() {
		balance = balance+500;
		System.out.println(balance);
	}
	
	
	

}
