package day4;

public class MethodVsConstructor {
	
	  MethodVsConstructor(){
		System.out.println("now I am a default method");
	}
	

	 MethodVsConstructor(String name,String city){
		 System.out.println("My name is "+ name);
		 System.out.println("My city is "+ city);
	}
	 MethodVsConstructor(String name,String city,int pin){
		 System.out.println("My name is "+ name);
		 System.out.println("My city is "+ city);
		 System.out.println("My pincode is "+ pin);
	}
	 MethodVsConstructor(int pin,String name,String city){
		 System.out.println("My name is "+ name);
		 System.out.println("My city is "+ city);
		 System.out.println("My pincode is "+ pin);
	}
	
	public static void main(String[] args) {
		new MethodVsConstructor("Chetan","HUbli");

		MethodVsConstructor m1= new MethodVsConstructor("Chetan","HUbli");
		MethodVsConstructor m2 =new MethodVsConstructor(23452,"issac","Madras");
		m1.addNum(322,33);
		m2.addNum(234, 234, 34);
	}
//method or function
	public void addNum(int a, int b) {
		int sum = a +b;
		System.out.println(sum);
	}
	//Method overloading
	public void addNum(int a, int b,int c) {
		int sum = a +b +c;
		System.out.println(sum);
	}
	
}
