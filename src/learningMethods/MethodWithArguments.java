package learningMethods;

public class MethodWithArguments {
	
	void subtractTwoNumbers(int number1, int number2) {
		int difference = number1-number2;
		System.out.println(difference);
		
	}
	
	//Method with return type and no arguments
	int finalPriceofPizza() {
		int pizzaPrice = 10;
		int tax = 5;
		int totalPrice = pizzaPrice+tax;
		
		return totalPrice;
	}
	
	

}
