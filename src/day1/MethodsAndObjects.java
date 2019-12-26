package day1;

public class MethodsAndObjects {
	
	String city;
 
	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		int sum = a+b;
//		System.out.println(sum);
		//Class Ref				= // class object
 		MethodsAndObjects method = new MethodsAndObjects();
		method.add(10, 30);
		method.add(40, 10);
		int val =method.add(3, 33,33);
		System.out.println(val);
		System.out.println(val+30*10);
		
		
	}
	
	//Access modifier // void- return type // add- method name (Pram)
	public void add(int i, int z) {
		//method body
		int sum = i +z;
		System.out.println(sum);
		
	}
	
	public int add(int i,int z,int y) {
		int sum = i+z+y;
		System.out.println(sum);
		return sum;
	}
	

}
