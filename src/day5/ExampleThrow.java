package day5;

public class ExampleThrow {
	
	public static void main(String[] args) throws ArithmeticException {
		int amt = 50;
		
		if(amt <100) {
			throw new ArithmeticException("Enter > 100");
		}else {
			System.out.println("With draw..");
		}
		
		
	}

}
