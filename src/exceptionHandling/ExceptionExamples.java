package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		List<Integer> employeeID = new ArrayList<Integer>();
		employeeID.add(101);
		employeeID.add(102);
		employeeID.add(103);

		Scanner sc = new Scanner(System.in);

		/*
		 * try { System.out.println(employeeID.get(4)); } catch
		 * (IndexOutOfBoundsException e) { // TODO: handle exception
		 * System.out.println("There are only 3 employees"); e.printStackTrace(); }
		 * 
		 * System.out.println("This is after the exception");
		 */
		FileInputStream file;
//		try {
			 file = new FileInputStream(new File("C:\\documentsPractice.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			System.out.println("Executed irrespective of the flow of the program");
//			System.out.println("Usage including but not limited to resource closure");
//		}

			 System.out.println("Execution of Line 40");
	}
	
	

}

