package exceptionHandling;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class ThrowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample throwsExample = new ThrowsExample();
		try {
			throwsExample.checkForheight(110);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throwsExample.parseMethod("Swaroop");
		} catch (ParseException|FileNotFoundException e1) {
			System.out.println("Incorrect format for parsing or File not found");
		}
		
		System.out.println("After the exception");
		
		try {
			formatter();
		} catch (ParseException e) {
			System.out.println("Parse Handled");
		}

	}
	
	public static void formatter() throws ParseException {
		ThrowsExample.formatDateAndTime("Swaroop");
	}

}
