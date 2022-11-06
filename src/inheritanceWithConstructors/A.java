package inheritanceWithConstructors;

public class A {
	
	
	String x = "Class A";
	public A() {
		super();
		System.out.println("This is  "+x+"  Constructor");
	}
	
	protected void printClassA() {
		System.out.println("This is a Class A Method");
	}
	
	
	

}
