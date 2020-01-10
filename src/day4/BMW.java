package day4;


// BMW child class / derived class / sub class
// Car is parent /base class 
public class BMW extends Car {
	
	
	public static void main(String[] args) {
		BMW b = new BMW();
		b.colour("merain blue");
		b.model("BMW 2020");
		b.sunroof();
	}
	
	public void sunroof() {
		System.out.println("BMW i500 Panromic Sunroof");
	}

}
