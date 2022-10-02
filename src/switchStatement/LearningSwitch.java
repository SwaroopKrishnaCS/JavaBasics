package switchStatement;

public class LearningSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int day = 8;
		
		switch (day) {
		
		case 1:
			System.out.println("Today is Monday");
			break;
		
		case 2:
			System.out.println("Today is Tuesday");
			break;
			
		case 3:
			System.out.println("Today is Wednesday");
			break;
			
		case 4:
			System.out.println("Today is Thursday");
			break;
			
		case 5:
			System.out.println("Today is Friday");
			break;
			
		case 6:
			System.out.println("Today is Saturday");
			break;
			
		case 7:
			System.out.println("Today is Sunday");
			break;
			
		default:
			System.out.println("Number of day in a week can be only from 1 to 7");
		
		}
		
		String dayofTheWeek = "Wednesday";
		switch (dayofTheWeek) {
		case ("Monday"):{
			System.out.println("It is Day 1 of the week");
			break;
		}
		case "Tuesday":
			System.out.println("It is Day 2 of the week");
			break;
		case "Wednesday":
			System.out.println("It is Day 3 of the week");
			break;
		case "Thursday":
			System.out.println("It is Day 4 of the week");
			break;
		case "Friday":
			System.out.println("It is Day 5 of the week");
			break;
		case "Saturday":
			System.out.println("It is Day 6 of the week");
			break;
		case "Sunday":
			System.out.println("It is Day 7 of the week");
			break;
		default:
			System.out.println("Please enter a valid day");
			break;
		}
		
		

	}

}
