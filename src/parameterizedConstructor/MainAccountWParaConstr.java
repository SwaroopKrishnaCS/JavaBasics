package parameterizedConstructor;

import learningMethods.AccountDetails;

public class MainAccountWParaConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccntDetailsWParaConstr swaroopAccount = new AccntDetailsWParaConstr("Swaroop", 459.62,"0159687");
//		
//		AccntDetailsWParaConstr harinderAccount = new AccntDetailsWParaConstr("Harinder", 456.41, "0123456");
//		
//		System.out.println(swaroopAccount.nameOnAcount);
//		System.out.println(swaroopAccount.balance);
//		System.out.println(swaroopAccount.accountNumber);
//		
//		
//		
//		System.out.println(harinderAccount.balance);
//		System.out.println(harinderAccount.accountNumber);
		
		AccntDetailsWParaConstr sanilAccount = new AccntDetailsWParaConstr();
		
		sanilAccount.accntDetailsWParaConstr("Sanil", 4567.87 , "7890415");
		
		AccntDetailsWParaConstr shanthiAccount = new AccntDetailsWParaConstr();
//		shanthiAccount.nameOnAcount = "Shanthi";
//		shanthiAccount.accountNumber = "7890144";
//		shanthiAccount.balance = 1234.85;
//		System.out.println(shanthiAccount.nameOnAcount);
//		System.out.println(shanthiAccount.accountNumber);
//		System.out.println(shanthiAccount.balance);
		shanthiAccount.accntDetailsWParaConstr("Shanthi", 1234.85, "7890144");
		System.out.println(shanthiAccount.getNameonAccount());
		System.out.println(sanilAccount.getNameonAccount());
		System.out.println(shanthiAccount.getNameonAccount());
		
		shanthiAccount.accntDetailsWParaConstr("Harinder", 1234.85, "7890144");
		System.out.println(shanthiAccount.getNameonAccount());
		
	}

}
