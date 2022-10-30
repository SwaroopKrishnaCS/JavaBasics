package stringMethods;

public class CharacterArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Swaroop Krishna Chitra Surendra Panicker";
		
		char[] nameCharArray = new char[name.length()];
		
		//populate the array
		for(int i=0;i<name.length();i++) {
			nameCharArray[i] = name.charAt(i);
		}
		
		
		
		//Find out how many times s occurs in the name
		int counter = 0;
		for(int i=0;i<nameCharArray.length;i++) {
			if(nameCharArray[i]=='S'||nameCharArray[i]=='s') {
				counter++;
			}
		}
		System.out.println("Number of occurances of S in the name "+counter);

	}

}
