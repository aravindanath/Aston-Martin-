package assignment;

import java.util.Scanner;

public class Bharathi_LogicalOperators {
	
	public static void main(String[] args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three unique numbers");
		int i =sc.nextInt();
		int j =sc.nextInt();
		int k =sc.nextInt();
		
		if (i > j && i > k)
			System.out.println(i +" is greatest");
		else if (j>i && j >k)
			System.out.println(j +" is greatest");
		else if (k>i && k > j)
			System.out.println(k +" is greatest");
		
		
				
		
		
		
	}
	
}
