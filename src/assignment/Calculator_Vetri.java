package assignment;

import java.util.Scanner;

public class Calculator_Vetri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum;
		int sub;
		
		System.out.println("Calculator Options ");
		System.out.println(" 1. Addition");
		System.out.println(" 2. Subtraction");
		System.out.println(" 3.Multiplication");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option ");
		int action = sc.nextInt();
		
		System.out.println("Enter first value ");
		int i = sc.nextInt();
		
		System.out.println("Enter second value ");
		int j = sc.nextInt();
		
		switch(action) {
		
		case 1 :
			
			sum = i+j;
			System.out.println("The sum of the entered numbers : " + sum);
			break;
			
		case 2:
			
			sub = i-j;
			System.out.println("The subtaction of the entered numbers : " + sub);
			break;
			
		case 3:
			int mul = i*j;
			System.out.println("The multiplicaiton of the entered number : "+ mul);
		}
		

	}

}
