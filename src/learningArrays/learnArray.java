package learningArrays;

public class learnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Store same type of values in a variable
		
		//Declare an Array
		
		//DatatypeofArray [] variableName = Provide the values
		
		int[] numList = {5,6,7,8,9};
		
		String[] nameList = {"Neethu", "Jasmeet", "Parul","Daman","Harinder","Lekshmi","Sahib","Rajbir","Shanthi","Jattan"};
		
		System.out.println(nameList[1]);
		System.out.println(nameList[3]);
		
		int sum = numList[1]+numList[3];
		System.out.println(sum);
		System.out.println("Age of "+nameList[5] + " is "+(numList[2]+numList[3]+numList[4]));
		
		//Declaration of Array 2nd way
		
		int [] numList1 = new int [4];
		numList1[0] = 5;
		numList1[1] = 7;
		numList1[2] = 9;
		numList1[3] = 11;
		numList1[4] = 13;
		
		String nameList1[] = {"ab","cd"};

	}

}
