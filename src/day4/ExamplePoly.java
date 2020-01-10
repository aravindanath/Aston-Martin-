package day4;

public class ExamplePoly {
	
	public static void main(String[] args) {
		RBI rbi; // Ref of super class
		rbi = new SBI();
		System.out.println("SBI is charging:"+ rbi.getIntest());
		rbi = new ICICI();
		System.out.println("ICICI is charging:"+ rbi.getIntest());
		
 
		
		
	}

}
