package day5;

public interface Appium {
	
	
	void click();
	abstract void scrol();
	
	default void defMethod() {
		System.out.println("def method");
	}

}
