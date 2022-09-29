package conditionIfElse;

public class IFCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageStudent = 19;
		boolean isAdult = ageStudent > 18;
		boolean hasMoney = false;
		
		// if age of student is > 18 he can drink
		// if he is < 18 he cannot drink
		if (isAdult) {
			if(hasMoney) {
				System.out.println("He can buy beer");
			}
			
			else {

				System.out.println("He cannot buy beer");

			}

		} 
		else {

			System.out.println("He cannot buy beer");

		}
	}



}
