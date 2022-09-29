/*4.	Ontario license authority checks for two things to issue a license, 
first is the age of person and the current level (G1 or G2 or G) . 
Assume different values for these two values and write code which will print, 
whether license will be issued to the person or not and 
if the license is issued, which type of license the person will get 
i.e. whether he will get a G1 or G2 or G.*/

package assignmentWeek4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageOfPerson = 16;
		String currentLevel = "G";

		if (ageOfPerson >= 16) {
			if (currentLevel.equals("G1")) {
				System.out.println("Lisense can be issued with class G2");
			} else if (currentLevel.equals("G2")) {
				System.out.println("Lisense can be issued with class G");
			} else if (currentLevel.equals("G")) {
				System.out.println("Already have a license with class G !!!!");
			} else {
				System.out.println("Invalid option");
			}

		} else {
			System.out.println("You are not eligible to take license");
		}

	}

}
