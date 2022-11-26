package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionInterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// can a try block exists by itself (without catch/ finally) No

		try {
			Integer.parseInt("String");
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}

		// can a finally block exists without try and catch: Yes
		finally {
			System.out.println("Does not need try and catch block");
		}

		// do we need a catch with every try block? Yes
		// not a good practice
		try {
			Integer.parseInt("String");
		} finally {
			System.out.println("cannot parse a String");
		}

//		can there be multiple catch blocks for a try block

		try {
			FileInputStream file = new FileInputStream(new File("C:\\DESKTOP-UP3KE4H_E\\Sep 3\\Finally.txt"));
			System.out.println("Reads a file");
			Integer.parseInt("10");
			System.out.println("Trying to parse a string as Integer");
			DateFormat format = new SimpleDateFormat("MM, dd, yyyy");
			format.parse("ManvirName");
			System.out.println("Parsing a date in incorrect format");
		} catch (FileNotFoundException |NumberFormatException|ParseException e) {
			System.out.println("File not found exception");
		}
		/*} catch (NumberFormatException e) {
			System.out.println("Trying to parse something that is not integer");
		} catch(ParseException e) {
			System.out.println("Trying to parse an incorrect format");	
		}*/

	}

}
