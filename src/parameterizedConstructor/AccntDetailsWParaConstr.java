package parameterizedConstructor;

public class AccntDetailsWParaConstr {

	String nameOnAcount;
	double balance;
	String accountNumber;

	public AccntDetailsWParaConstr(String accountName, double bal, String accountNo) {

		nameOnAcount = accountName;
		balance = bal;
		accountNumber = accountNo;
	}
	
	AccntDetailsWParaConstr(){
		
	}
	
	void accntDetailsWParaConstr(String accountName, double bal, String accountNo) {

		nameOnAcount = accountName;
		balance = bal;
		accountNumber = accountNo;
	}
	
	String getNameonAccount() {
		return nameOnAcount;
	}
	

	
}
