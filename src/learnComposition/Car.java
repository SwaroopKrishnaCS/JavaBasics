package learnComposition;

public class Car {
	
	private String carModel;
	
	private int ModelYear;
	
	private double price;

	public Car(String carModel, int modelYear, double price) {
		super();
		this.carModel = carModel;
		ModelYear = modelYear;
		this.price = price;
	}

	public String getCarModel() {
		return carModel;
	}

	public int getModelYear() {
		return ModelYear;
	}

	public double getPrice() {
		return price;
	}
	
	

}
