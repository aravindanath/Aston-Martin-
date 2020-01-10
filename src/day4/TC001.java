package day4;

public class TC001 {
	//non static vaiable
 //Global var
	static String  city = "Hyd";
	public static void main(String[] args) {
		
		
// class name . method name
		TC001 t = new TC001();
		TC001.StatMehtod();
		t.nonStatMehtod();
	 
	}
//
	public static void StatMehtod() {
		System.out.println("I am static method");
		System.out.println(city);
	}
	
	public  void nonStatMehtod() {
		System.out.println("I am non static method");
		city="Banalore";
		System.out.println(city);
	}
	
	
}
