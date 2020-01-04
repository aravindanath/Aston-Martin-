package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sumit_AddMultiple_n_Number {

	public static void main(String[] args) {
		Sumit_AddMultiple_n_Number calc1 = new Sumit_AddMultiple_n_Number();
		Scanner scann = new Scanner(System.in);
		System.out.println("Please specify if you would like to add or multiply n numbers");
		String n = scann.nextLine();
		System.out.println("Please enter all the number seperated by comma");
		String numbers = scann.nextLine();
		String[] nos = numbers.split(",");
		if(n.equalsIgnoreCase("add")){
			calc1.str1(nos);
		} else if(n.equalsIgnoreCase("multiply")) {
			calc1.str2(nos);
		} else {
			System.out.println("Please select a valid operator");
		}
		scann.close();
	}

	public void str1(String[] abc) {
		int s41 = 0;
		for (int i1 = 0; i1 < abc.length; i1++) {
			String s1 = (String) Array.get(abc, i1);
			int s2 = Integer.parseInt(s1);
			s41 = s41 + s2;
		}
		System.out.println("Addition value is: " + s41);
	}

	public void str2(String[] xyz) {
		int s42 = 1;
		for (int i2 = 0; i2 < xyz.length; i2++) {
			String s12 = (String) Array.get(xyz, i2);
			int s22 = Integer.parseInt(s12);
			s42 = s42 * s22;
		}
		System.out.println("Multiplication value is " + s42);
	}
}
