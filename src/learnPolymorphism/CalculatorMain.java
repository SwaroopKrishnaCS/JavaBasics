package learnPolymorphism;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition addition = new Addition();
		addition.additionOfNumbers(10, 20);
		addition.additionOfNumbers(10, 20, 30);
		
		addition.validateLogin(1234);
		addition.validateLogin("acb@456");
		addition.validateLogin("abc@1234", 1234);
		
//		Math.abs(10f);
//		Math.abs(20);
//		Math.abs(22.2);

	}

}
