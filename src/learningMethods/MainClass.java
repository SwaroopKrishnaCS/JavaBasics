package learningMethods;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//className referenceVariable = new className();
		
		//Instantiate a class
		//Instance of a class
		//Class Instance
		SimpleMethod sm = new SimpleMethod();
		
		//Call the method using the reference variable
		sm.addTwoNumbers();
//		int num1 = 15;
//		int num2 = 10;
		
		MethodWithArguments mwA = new MethodWithArguments();
		
		mwA.subtractTwoNumbers(45, 25);
		mwA.subtractTwoNumbers(25,100);
		mwA.subtractTwoNumbers(100,110);
		mwA.subtractTwoNumbers(75,43);
		
		int finalPrice = mwA.finalPriceofPizza();
		System.out.println("Final Price: "+finalPrice);
		int garlicDipPrice = 1;
		finalPrice = finalPrice+garlicDipPrice;
		System.out.println("Final Price with garlic Dip: "+finalPrice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
