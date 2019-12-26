package day2;

public class RegEx {

	public static void main(String[] args) {

		String msg = " Hi your account has been debited Rs.xxxx "
				+ "OTP 123324 to complete the txn.";
		System.out.println(msg.matches("\\6"));
		

	}

}
