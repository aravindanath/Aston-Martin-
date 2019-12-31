package day3;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Month:");
		String month = sc.next();
		// Switch(Conditon)
		switch (month) {
		case "jan":
			System.out.println("This is Jan 2020");
			 int i =10;
			break;
		case "feb":
			System.out.println("This is feb 2020");
			break;
		case "mar":
			System.out.println("This is mar 2020");
			break;
		case "apr":
			System.out.println("This is apr 2020");
			break;
		case "may":
			System.out.println("This is may 2020");
			break;
		case "june":
			System.out.println("This is june 2020");
			break;
		
		default:
			System.out.println("Enter only first 6 months");
			break;
		}

		
		System.out.println("Out of condition");
	}

}
