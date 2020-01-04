/*
 * 
 * @SumitKumar - TO read OTP from string when format is not known
 * 
 */

package assignment;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.*;

public class Sumit_ReadOTPfromArray {

	public static void main(String[] args) {

		Scanner t1 = new Scanner(System.in);
		System.out.println("PLease enter complete string");
		String t2 = t1.nextLine();
		System.out.println("What is the length of OTP being generated?");
		int t3 = t1.nextInt();
		String[] t5 = t2.split(" ");
		outer: for (int t4 = 0; t4 < t5.length; t4++) {
			String s5 = (String) Array.get(t5, t4);
			inner: for (int t6 = 0; t6 < t3; t6++) {
				if (s5.charAt(t6) >= '0' && s5.charAt(t6) <= '9') {

					if (t6 == (t3 - 1)) {
						System.out.println("OTP in the string is: " + s5);
						break outer;
					}
				} else {
					break inner;
				}

			}
		}

	}

}
