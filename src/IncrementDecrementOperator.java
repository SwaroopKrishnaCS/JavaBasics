
public class IncrementDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 6;
//		
//		
		//PreIncrement Operator
		
//		num1 = ++num1+num2;  //increments the value by 1, num1 = num1+1
//		
//		System.out.println(num1);
		
		//PostIncrement Operator
//		
		
//		num2 = num1++ + num2; 	//increments the value by 1, num1 = num1+1
//		num2 = num1++  + num2;
//		num1 = num1+1 = 5+1 =6
//		num1+num2 = 5+_6=  11 = num2
				
//		System.out.println(num2);
//		System.out.println(num1);
		
//		int studentNumber = 1;
//		System.out.println(studentNumber++);
//		System.out.println(++studentNumber);
		
		//PreDecrement Operator   --num1
		
		int num3 = --num1;
//		
		System.out.println(num3);
		System.out.println(num1);
		
//		int num3 = num1--;
		
//		System.out.println(num3);
//		System.out.println(num1);
		
		
		int i = 11;
        
//        i = i++ + ++i;
		
//        i = ++i + i++;
        
//        i = ++i  -  --i;
        //	(11) +  ++(11+1) 
         			//13
		
		i = --i  +  ++i;
		
		System.out.println(i);
	}

}
