package learnComposition;

import java.util.Scanner;

public class CompositionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DealerShip ds = new DealerShip();
		
		Car hondaCivic = new Car("Honda Civic", 2022, 29000);
		
		Car corolla = new Car("Toyota Corolla", 2022, 29500);
		
		Car tesla = new Car("Tesla", 2022, 105000);
				
		
		Scanner sc = new Scanner(System.in);
		//Adding car to dealership
//		ds.addCarstoDelaership(hondaCivic);
		
		
//		System.out.println("Price for car: "+ds.getCar().getPrice());
		
		ds.addCarsToDelaership(hondaCivic);
		ds.addCarsToDelaership(corolla);
		ds.addCarsToDelaership(tesla);
		
		System.out.println("Which car you want to buy. Available Options are Honda Civic, Toyota Corolla and Tesla");
		
		String carRequested = sc.nextLine();
		
		System.out.println("Price for the car requested is: "+ds.getRequestedCarPrice(carRequested));

	}

}
