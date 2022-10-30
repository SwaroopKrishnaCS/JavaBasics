package stringMethods;

import java.util.Scanner;

public class StringFormatMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "My name is %s and my age is";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String jasmeetName = sc.next();
		System.out.println("Enter your age");
		String jasmeetage = sc.next();
		
		
		System.out.println(String.format(name, jasmeetName,jasmeetage));
		

	}

}
