package day3;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Month:");
		String month = sc.next();
		// Key
		switch (month) {
		// Value
		case "Jan":
			System.out.println("This jan month");

			break;
		case "Feb":
			System.out.println("This feb month");

			break;
		case "Mar":
			System.out.println("This Mar month");

			break;
		case "Apr":
			System.out.println("This APr month");

			break;
		case "May":
			System.out.println("This May month");

			break;

		default:

			System.out.println("Enter first 5 months only!");
			break;
		}

		System.out.println("Out of case");

	}

}
