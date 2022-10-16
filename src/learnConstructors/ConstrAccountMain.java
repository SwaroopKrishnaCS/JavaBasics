package learnConstructors;

import java.util.Scanner;

public class ConstrAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AccountDetailswithConstr accountDetailswithConstr = new AccountDetailswithConstr();
		System.out.println(accountDetailswithConstr.accountNumber);
		
		accountDetailswithConstr.updateBalance();
		
		System.out.println(accountDetailswithConstr.pIN);
		
		accountDetailswithConstr.pIN = 4567;
		
		System.out.println(accountDetailswithConstr.pIN);
		

	}

}
