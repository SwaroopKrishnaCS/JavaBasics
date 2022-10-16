package parameterizedConstructor;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaptopClass hP = new LaptopClass("Windows", "i3", 8);
		LaptopClass dell = new LaptopClass("Windows", "i5", 16);
		LaptopClass mB = new LaptopClass();
		
		dell.initilizeVariables("MAC", "catalena", 12);
		
		mB.initilizeVariables("Windows", "superProcessor", 4);
		
		System.out.println(mB.getOsName());
		
		System.out.println(mB.getRam());

	}

}
