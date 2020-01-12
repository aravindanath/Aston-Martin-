package day4;

public class ExampleStatic {
	 
	
	//non static global variable
	public static int otp;
	static String collage ="CMRIT";
	
	
	public static void main(String[] args) {
		
		ExampleStatic e = new ExampleStatic();


		e.addnum(220,20);
		System.out.println(otp);

	}

	
	public int addnum(int a , int b) {
		 otp = a +b;
		 return otp;
	}
	
	public  int addnum(int a , int b,int c) {
		int sum = a +b+c;
		 return sum;
	}
	
	public static void studentDetailsMhalli(String name, int roll) {
		//local variable 
		String branch = "Marathalli";
		System.out.println("Student name is "+ name);
		System.out.println("Student roll is "+ roll);
		System.out.println("Student barnch is "+ branch);
		System.out.println("Student collage is "+ collage);
	}
	
	public void studentDetailsWhiteField(String name, int roll) {
		//local variable 
		this.collage ="CMRITW";
		String branch = "WhiteField";
		System.out.println("Student name is "+ name);
		System.out.println("Student roll is "+ roll);
		System.out.println("Student barnch is "+ branch);
		System.out.println("Student collage is "+ collage);
	}
	

	
	
	
}
