package learnInheritance;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dell dell = new Dell();
		
		dell.screenSize();
		dell.keyboard();
		dell.operatingSystem();
		dell.processor();
		String screenSize = dell.laptopScreenSize;
		System.out.println("Screen size for the Laptop should be "+screenSize);
		
		HP hp = new HP();
		
		hp.payingExtraCharge(true);

	}

}
