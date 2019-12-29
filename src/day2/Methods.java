package day2;
// PKG name.Class name
import java.util.Scanner;

public class Methods {
	
	public static void main(String[] args) {
		// Class ref = (Object of the classs)
		Methods ref = new Methods();
		//ctrl + Shift + o--> import the pkg
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num1 = sc.nextInt();
		System.out.println("Enter number:");
		int num2 = sc.nextInt();
		ref.addNumber(num1, num2);
		int val = ref.mulNum(num1, num2);
		System.out.println(val +1);
		
	}
	
	// Access modifiers, return type, method name (Parameters)
	//{Method body}
	public void addNumber(int i, int j) {
		int sum = i + j;
		System.out.println("Sum of "+i+" and "+j+" is "+sum);
	}

	
	public int mulNum(int i,int j) {
		int mul = i * j;
		return mul;
	}
	
	public float studentPer() {
		
		return  99.02f;
	}
}
