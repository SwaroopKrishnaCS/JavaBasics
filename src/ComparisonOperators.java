
public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// = "Assign Operator"
		// == "Comparison Operator"
//		Equal to
		int num1 = 10;
		int num2 = 20;
//		 ==
//		boolean isEqual
//		boolean isNum1EqualtoNum2 
		boolean areNum1Num2Equal = num1==num2;
		System.out.println("Is num1 equal num2 "+areNum1Num2Equal);
		
		//Greater than
		
		int ageManvir = 34;
		boolean canManvirPlayCasino =ageManvir>18;
		//System.out.println("Manvir can play Casino: "+ canManvirPlayCasino);
		
		System.out.println("Manvir can play Casino: "+(ageManvir>18));
		
		//Manvir can play Casino (34>18)
		
		
		//Less than
		
		// >=, <=
		//35>=35
		
		System.out.println(35>35);
		
		//No Equal to !=
		
		boolean isNum1NotEqualNum2 = num1!=num2;
		System.out.println(isNum1NotEqualNum2);
		boolean isNavjotLearningJava = !true;
		isNavjotLearningJava = !false;
		System.out.println(!isNavjotLearningJava);
		System.out.println("are both equal" +(isNum1NotEqualNum2==isNavjotLearningJava));
		
//		System.out.println(isNavjotLearningJava == 5);
		
		System.out.println("Harinder is in Canada"+(34>18));
		System.out.println("Rajbir"+"Kaur"+"Age"+"is equal to"+34);

		
	

	}

}
