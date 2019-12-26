package day1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Class ref = Class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st number:");
		int num1 = sc.nextInt();
		System.out.println("Enter a 2nd number:");
		int num2 = sc.nextInt();

		System.out.println("Enter your name :");
		String name = sc.next();
		String collage = sc.next();
		int roll = sc.nextInt();
		sc.close();

		UserInput u = new UserInput();
		u.add(num1, num2);

		u.studentDetails(name, collage, roll);

	}

	public void add(int z, int y) {
		int sum = z + y;
		System.out.println("Sum of " + z + " and " + y + " is " + sum);
	}

	public void studentDetails(String name, String collage, int roll) {

		System.out.println(name + " belongs to " + collage + " and his / her roll number " + roll);
	}

}
