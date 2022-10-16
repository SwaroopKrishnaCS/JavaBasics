package parameterizedConstructor;

public class LaptopClass {
	
	String operatingSystem;
	String processor;
	int ram;
	public LaptopClass(String oS, String procsr, int rAM) {
		operatingSystem = oS;
		processor = procsr;
		ram = rAM;
	}
	
	
	void initilizeVariables(String oS, String procsr, int rAM) {
		operatingSystem = oS;
		processor = procsr;

	}
	
	public LaptopClass() {
		// TODO Auto-generated constructor stub
	}
	
	String getOsName() {
		return operatingSystem;
	}
	
	
	int getRam() {
		return ram;
	}

}
