package AssignmentWeek5;

public class PizzaAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char pizzaSize = 'S';// size of pizza should be in Capital Letter
		boolean pepperoniTopping = false;
		boolean extraCheese = false;
		int priceForSmallPizza = 15;// small pizza price is $15
		int priceForMediumPizza = 20;// medium pizza price is $20
		int priceForLargePizza = 25;// large pizza price is $25
		int pricePepperoniForSmall = 2;
		int pricePepperoniForMediumLarge = 3;
		int priceExtraCheese = 1;
		int finalBill = 0;

		if (pizzaSize != ' ') {
			switch (pizzaSize) {
			case 'S':
				finalBill += priceForSmallPizza;
				if (pepperoniTopping == true) {
					finalBill += pricePepperoniForSmall;
				}
				if (extraCheese == true) {
					finalBill += priceExtraCheese;
				}
				break;
			case 'M':
				finalBill += priceForMediumPizza;
				if (pepperoniTopping == true) {
					finalBill += pricePepperoniForMediumLarge;
				}
				if (extraCheese == true) {
					finalBill += priceExtraCheese;
				}
				break;
			case 'L':
				finalBill += priceForLargePizza;
				if (pepperoniTopping == true) {
					finalBill += pricePepperoniForMediumLarge;
				}
				if (extraCheese == true) {
					finalBill += priceExtraCheese;
				}
				break;
			default:
				break;
			}
			System.out.println("Your Final Bill is $" + finalBill);
		} else {
			System.out.println("Please select the Pizza Size");
		}

	}

}
