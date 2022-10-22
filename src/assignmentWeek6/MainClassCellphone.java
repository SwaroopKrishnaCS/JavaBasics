package assignmentWeek6;

import java.util.Scanner;

public class MainClassCellphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Instantiate the class CellphonePlanSelection
		CellPhoneMethods cp = new CellPhoneMethods();
		int invalidAttempts = 0;
		while (invalidAttempts <= 2) {
			System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
			String userChoice = sc.nextLine();
			if (userChoice.equalsIgnoreCase("samsung")) {
				int modelInvalidAttempts = 0;
				do {
					System.out.println("Please enter the model that you want to buy from below");
					String model = cp.getSamsungModel();// Invoking method samsungModelSelection of class
																// CellphonePlanSelection
					if (!model.equals("")) {
						int modelCost = cp.getSamsungModelPrice(model);// Invoking method samsungModelPrice of class
						// CellphonePlanSelection
						System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
						String networkPlan = sc.nextLine();
						int planPrice = cp.getPlanPrice(networkPlan);// Invoking method networkPlans of class
																		// CellphonePlanSelection
						cp.calculateFinalMonthlyPayment(model, networkPlan, modelCost, planPrice);// Invoking method
						System.exit(0); // billForModelAndPlan
					} else {
						System.out.println("No match for that model");
						modelInvalidAttempts++;
					}
				} while (modelInvalidAttempts <= 2);
				System.exit(0);
			} else if (userChoice.equalsIgnoreCase("apple")) {
				int modelInvalidAttempts = 0;
				do {
					System.out.println("Please enter the model that you want to buy from below");
					String model = cp.getAppleModel();// Invoking appleModelSelection method of class
															// CellphonePlanSelection
					if (!model.equals("")) {
						int modelCost = cp.getAppleModelPrice(model);
						int planInvalidAttempt = 0;

						do {
							System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
							String networkPlan = sc.nextLine();// Invoking method networkPlans of class
																// CellphonePlanSelection
							int planPrice = cp.getPlanPrice(networkPlan);
							if (planPrice != 0) {
								cp.calculateFinalMonthlyPayment(model, networkPlan, modelCost, planPrice);// Invoking method
								break;
							} else {
								System.out.println("No match for that plan.");
								planInvalidAttempt++;
							}

						} while (planInvalidAttempt <= 2);
						System.exit(0); // billForModelAndPlan
					} else {
						System.out.println("No match for that model");
						modelInvalidAttempts++;
					}
				} while (modelInvalidAttempts <= 2);
				System.exit(0);
			} else {
				System.out.println("Brand " + userChoice + " is not available");
				invalidAttempts++;
			}
			if (invalidAttempts == 3) {
				System.out.println("You have reached the maximum attempt please start once again");
			}
		}
	}

}
