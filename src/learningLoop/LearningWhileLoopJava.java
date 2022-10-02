package learningLoop;

public class LearningWhileLoopJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("I will study 2-3 hours everyday");
//		System.out.println("I will study 2-3 hours everyday");
//		System.out.println("I will study 2-3 hours everyday");

		// while Loop
		int counter = 1;
		int actualPIN = 1234;
		int enteredPIN = 1234;
		
		
//		while(counter<=10) {
//			System.out.println("I will study 2-3 hours everyday  "+counter);
//			counter +=2;
//		}

		// do while

		do {
			System.out.println("PIN Entered: " + counter + " times");
			if (actualPIN == enteredPIN) {
				System.out.println("PIN Entered is correct");
				break;
			}
			counter++;
			
		} while (counter <= 3);
		
		if (counter > 3) {
			System.out.println("The card is locked");
		}
		
		

	}

}
