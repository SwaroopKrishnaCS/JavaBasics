package learnAbstractionAbstractClass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abstract Class cannot be instantiated
//		BOC boc = new BOC();
		
		Scanner sc = new Scanner(System.in);
		RBC rbc = new RBC();
		
		rbc.bankAccount();
		
		rbc.provideCreditCard(1000);
		rbc.interestRate();
		
		BOC bocRbc = new RBC();
		
		bocRbc.bankAccount();
		bocRbc.provideCreditCard(1500);
		bocRbc.interestRate();

		CIBC cibc = new CIBC();
		cibc.provideCreditCard(2000);
	}

}
