package day4;

public class DemoAccessModifier {

	public static void main(String[] args) {

		DemoAccessModifier d = new DemoAccessModifier();
		d.defMethod();
		d.proMethod();
		d.pubMethod();
		d.pvtMethod();
	}

	public String name;
	protected String city;
	String sub;
	private String cardnumber;

	public void pubMethod() {
		System.out.println("This is a public method");
	}

	protected void proMethod() {
		System.out.println("This is a protected method");
	}

	private void pvtMethod() {
		System.out.println("This is a private method");
	}

	void defMethod() {
		System.out.println("This is a default method");
	}

}
