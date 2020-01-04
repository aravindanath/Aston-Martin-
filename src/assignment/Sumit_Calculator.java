/*
 * Sumitkumar- Calculator class
 */

package assignment;

import java.util.Scanner;

public class Sumit_Calculator {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please specify which operation you want to perform add/subtract/multiply/division?");
		String s2 = scan.nextLine();
		System.out.println("Please enter the first number:");
		double num1 = scan.nextDouble();
		System.out.println("Please enter the Second number:");
		double num2 = scan.nextDouble();
		Sumit_Calculator calc = new Sumit_Calculator();

		switch (s2) {

		case "add":
			calc.add(num1, num2);
			break;
		case "subtract":
			calc.sub(num1, num2);
			break;
		case "multiply":
			calc.multiple(num1, num2);
			break;
		case "division":
			calc.division(num1, num2);
			break;
		default:
			System.out.println("Please select a valid operator");
		}

	}

	public void add(double i, double j) {
		double sum = i + j;
		System.out.println("Addition value is: " + sum);
	}

	public void sub(double i1, double j1) {
		double sub = i1 - j1;
		System.out.println("Subtraction value is: " + sub);
	}

	public void multiple(double i2, double j2) {
		double mult = i2 * j2;
		System.out.println("Multiplication value is: " + mult);
	}

	public void division(double i3, double j3) {
		double div = i3 / j3;
		System.out.println("Division value is: " + div);
	}
}
