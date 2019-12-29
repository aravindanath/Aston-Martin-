package day2;

public class TernaryOperator {
	
	public static void main(String[] args) {

		String browser = "chrome";
		String result;
		// If condition ? else if condtion
		result = browser.equalsIgnoreCase("Chrome")?"chrome":"firefox";
		System.out.println(result);
	
	}

}
