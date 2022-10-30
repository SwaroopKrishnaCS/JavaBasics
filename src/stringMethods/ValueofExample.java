package stringMethods;

public class ValueofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Manvir Singh Parmar";
		boolean doesNamehaveSingh = name.contains("Singh");
		
		//convert boolean to String
		
		String booleanToString = String.valueOf(doesNamehaveSingh);
		System.out.println(booleanToString);
		
		int age = 34;
		
		//convert integer to string
		//String ageToString = "34";
		String ageToString = String.valueOf(age);
		System.out.println(ageToString+22);
		

	}

}
