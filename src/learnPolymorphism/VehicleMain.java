package learnPolymorphism;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		Vehicle vehicle = new Vehicle();
		Truck truck = new Truck();
		car.startEngine();
		truck.startEngine();
		vehicle.startEngine();

	}

}
