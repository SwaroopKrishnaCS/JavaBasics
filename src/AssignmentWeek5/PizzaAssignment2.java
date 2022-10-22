package AssignmentWeek5;

public class PizzaAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int smallPizzaPrice = 15;
		int mediumPizzaPrice = 20;
		int largePizzaPrice = 25;
		int totalBill=0;
		boolean isPepperoniAdded = true;
		boolean isextraChesseAdded = false;
		int smallPizzaPepperoni = 0;
		int mediumPizzaPepperoni = 0;
		int largePizzaPepperoni = 0;
		int extraCheese = 0;
		String pizzaSize = "medium";
		switch (pizzaSize) {
		case "small":
			System.out.println("You have ordered small pizza");
			if (isPepperoniAdded) {
				smallPizzaPepperoni=2;
			}
			if (isextraChesseAdded) {
				extraCheese=1;
			}
			totalBill = smallPizzaPrice+smallPizzaPepperoni+extraCheese;
			break;
		case "medium":
			System.out.println("You have ordered medium pizza");
			if (isPepperoniAdded) {
				mediumPizzaPepperoni=3;
			}
			if (isextraChesseAdded) {
				extraCheese=1;
			}
			totalBill = mediumPizzaPrice+mediumPizzaPepperoni+extraCheese;
			break;
		case "large":
			System.out.println("You have ordered large pizza");
			if (isPepperoniAdded) {
				largePizzaPepperoni=3;
			}
			if (isextraChesseAdded) {
				extraCheese=1;
			}
			totalBill = largePizzaPrice+largePizzaPepperoni+extraCheese;
			break;
		default:
			System.out.println("enter valid pizza size");
			break;
		}
		System.out.println("Total Bill = $" + totalBill);

	}

}
