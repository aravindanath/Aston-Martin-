package day3;

import java.util.Scanner;

public class IfElseIfCondition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter your marks:");
		int marks =sc.nextInt();
		
		if(marks < 35 ) {
			System.out.println("Fail");
		}else if(marks>=35 && marks<50) {
			System.out.println("Pass class");
		}else if(marks>=50 && marks<65) {
			System.out.println("Second class");
		}else if(marks>=65 && marks<85) {
			System.out.println("First class");
		}else if(marks>=85 && marks<=1100) {
			System.out.println("Top class");
		}else {
			System.out.println("Contact Admin");
		}
		
		System.out.println("Out of condition");
		
		
	}

}
