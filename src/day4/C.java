package day4;

public class C extends B {
	
	public static void main(String[] args) {
		C c = new C();
		c.method1();
		c.method2();
		 c.method3();
		 
		 A a=  new A();
		 a.method1();
		
	}
	
	public void method3() {
		System.out.println("Method3");
	}

}
