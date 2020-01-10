package day4;

public class ExampleMethods {
	
	
	public static void main(String[] args) {
		
//		int i = 10;
//		int j = 20;
//		int sum = i +j;
//		
//		System.out.println(sum);
//		
//		int ii = 20;
//		int jj = 440;
//		int sum2 = ii +jj;
//		
//		System.out.println(sum2);
		ExampleMethods e = new ExampleMethods();
		e.addNo(33, 44);
		e.addNo(3223, 4224);
		
	}

	public void addNo(int i, int j) {
		int sum = i +j;
		System.out.println(sum);
	}
}
