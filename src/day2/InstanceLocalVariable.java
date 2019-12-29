package day2;

public class InstanceLocalVariable {
	//Instane or Global variable 
	static String city = "Bangalore";
 
	public static void main(String[] args) {
		System.out.println("i am from "+ city);
		InstanceLocalVariable i = new InstanceLocalVariable();
		i.employee("Kaveri");
		i.students("Vetri");
	
		employee("Arvind");
		
	}
	//  non static methods
	public void students(String name) {
		String collage = "Jain";
		city = "Hyd";
		System.out.println("Student name is "+ name);
		System.out.println("Student is from "+ city);
		System.out.println("Student is from "+ collage);
	}
	
	public static void employee(String name) {
		String tecPark = "EGL";
		
		System.out.println("employee name is "+ name);
		System.out.println("employee is from "+ city);
		System.out.println("employee is from "+ tecPark);
	}

}
