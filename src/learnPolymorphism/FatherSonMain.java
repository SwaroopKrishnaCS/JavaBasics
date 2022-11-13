package learnPolymorphism;

public class FatherSonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Baby baby = new Baby();
//
//		baby.shooting();
//
//		Father father = new Father();
//		father.shooting();
//
		GrandBaby grandBaby = new GrandBaby();
		grandBaby.shooting();
//
//		// Parent Class reference variable initialized with child class constructor
		Father father1 = null;

		

		String selection = "Baby";
		switch (selection) {
		case "Father":
			father1 = new Father();
			
			break;

		case "Baby":
			father1 = new Baby();
			break;

		case "GrandBaby":
			father1 = new GrandBaby();
			break;

		case "GreatGrandBaby":
			father1 = new GreatGrandBaby();
			break;

		default:
			break;
		}
		
		father1.shooting();
		father1.practiceShooting();

	}

}
