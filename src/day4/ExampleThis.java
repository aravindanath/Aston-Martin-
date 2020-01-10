package day4;

public class ExampleThis {
	
	String city = "hyd";
	
	public static void main(String[] args) {
		
		ExampleThis e = new ExampleThis();
		e.student();
		e.student2();
		e.student3();
		
	}
	
	public void student() {
		System.out.println("i am from "+ city);
	}
	public void student2() {
		this.city= "Blr";
		System.out.println("i am from "+ city);
	}

	public void student3() {
		this.city= "che";
		System.out.println("i am from "+ city);
	}
}
