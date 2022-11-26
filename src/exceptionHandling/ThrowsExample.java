package exceptionHandling;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThrowsExample {

	public void checkForheight(int height) throws Exception {
		if (height >= 120) {
			System.out.println("You can use the ride");
		} else {
			throw new Exception("Height not sufficient to ride");
		}
	}

	public void parseMethod(String integerToBeParsed)throws ParseException, FileNotFoundException{
	
			Integer.parseInt(integerToBeParsed);
		
	}
	
	public static void formatDateAndTime(String dateFormat) throws ParseException {
		DateFormat format = new SimpleDateFormat("MM, dd, yyyy");
		format.parse(dateFormat);


	}

}
