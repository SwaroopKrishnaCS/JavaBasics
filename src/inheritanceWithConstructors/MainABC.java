package inheritanceWithConstructors;

import learnInheritance.E;

public class MainABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		
		D d = new D();
		
//		Object object = new D();
		
		A a = new C();
		
		B b = new C();
		
		c.printClassA();
		
		
//		A a = new A();
		
//		B b = new B();
		
		System.out.println(c.x);
//		System.out.println(c.y);
//		System.out.println(c.z);
		
		E e = new E();
		
		e.printClassA();

	}

}
