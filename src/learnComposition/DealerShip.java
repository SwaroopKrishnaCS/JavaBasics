package learnComposition;

public class DealerShip {

	String dealershipName;

	Car[] car = new Car[10];

//	public Car getCar() {
//		return car;
//	}
//
//	public void addCarstoDelaership(Car car) {
//		this.car = car;
//	}

	public void addCarsToDelaership(Car car) {
		for (int i = 0; i < this.car.length; i++) {
			if (this.car[i] == null) {
				this.car[i] = car;
				break;
			}
		}
	}

	public double getRequestedCarPrice(String carRequested) {
		double priceOfCar = 0;
		for (int i = 0; i < car.length; i++) {
			if (car[i].getCarModel().equalsIgnoreCase(carRequested)) {
				priceOfCar = car[i].getPrice();
				break;
			}
		}
		return priceOfCar;
	}
}
