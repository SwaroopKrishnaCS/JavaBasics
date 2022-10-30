package stringMethods;

public class StringFormats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "navjot";
		// Change String to Upper case
		String upperCaseName = name.toUpperCase();
		System.out.println("Upper case Name: "+upperCaseName);
		
		//Change String to Lower case
		String nameKuldeep = "KulDeeP";
		String lowerCaseName = nameKuldeep.toLowerCase();
		System.out.println("Lower Case Name: "+ lowerCaseName);
		
		//Find the length of String
		String username = "qwertyuiioopgsddf";
		System.out.println("Length of the Username: "+username.length());
		
		String manvirName = "   Manvir Singh Parmar   ";
//		manvirName = manvirName.replace(" ", "");
		System.out.println("Length of Manvir Name "+(manvirName.replace(" ", "")).toUpperCase().length());
		
		//Trim leading and Trailing White Spaces
		System.out.println("Without leading and trailing before name: "+manvirName.trim());
		System.out.println("Length of Manvir Name with spaces in between: "+manvirName.trim().length());
		
		//Replace all with regex
		String rajbirName = "Just Rajbir Kaur is 35 years old";
		
		//Replace Characters A word character: [a-zA-Z_0-9]
		System.out.println(rajbirName.replaceAll("\\w", "*"));
		
		//A digit: [0-9]
		System.out.println(rajbirName.replaceAll("\\d", "*"));
		
		
		
		
		

	}

}
