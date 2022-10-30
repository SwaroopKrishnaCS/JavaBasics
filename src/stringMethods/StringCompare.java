package stringMethods;

import java.util.Iterator;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc = "ABC";
		String abc1 = "DEF";

		// Compare two String variables
		if (abc.equals(abc1)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Both strings are different");
		}

		// Compare Strings ignoring case
		String xyz = "XYZ";
		String xyz1 = "xYz";

		if (xyz.equalsIgnoreCase(xyz1)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Both strings are different");
		}

		// Contains a sequence of characters
		String email = "abc123@email.com";

		if (!email.isEmpty()&&email.contains("@")) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid email");
		}

		String harinderName = "Harinder Kaur";
		if (harinderName.contains("Kaur")) {
			System.out.println("Name contains Kaur");
		} else {
			System.out.println("Does not contain Kaur");
		}

		// Change string to another

		String damanName = "Damanpreet Singh";

		String damanUpdatedName = damanName.replace("preet", "jit");

		System.out.println("New name of Daman " + damanUpdatedName);

		String knowAnyone = "Jattan knows Aman who doesn't know Daman";

		String newKnowAnyone = knowAnyone.replace("an", "en");
		System.out.println("New String " + newKnowAnyone);

		// Array of Strings. Find number of preet in the array of String
		String[] nameList = { "Damanpreet", "Jattanpreet", "Amanpreet", "Jaspreet", "Kuldeep" };
		int count = 0;
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].contains("preet")) {
				count++;
			}
		}
		System.out.println("There are " + count + " preet in the array");

		// Change preet to jit
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].contains("preet")) {
				nameList[i] = nameList[i].replace("preet", "jeet");
			}
			System.out.println(nameList[i]);

		}
	}

}
