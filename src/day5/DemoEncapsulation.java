package day5;

public class DemoEncapsulation {

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.setAge(29);
		int age = e.getAge();
		System.out.println("Age is " + age);
		e.setCity("Banaglore");
		e.setName("Arvind");
		System.out.println("city is " + e.getCity());
		System.out.println("name is " + e.getName());
		e.setAge(29);
		e.setCity("Chennai");
		e.setName("Kingston");
		System.out.println("Age is " + e.getAge());
		System.out.println("city is " + e.getCity());
		System.out.println("name is " + e.getName());

	}

}
