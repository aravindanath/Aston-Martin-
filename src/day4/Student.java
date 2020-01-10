package day4;

public class Student {
 
	// Constructor
	Student() {
		System.out.println("I am a constructor");
		System.out.println("**************************");
	}

	// constructor overloading

	Student(String name, int roll) {
		System.out.println("Student name is " + name);
		System.out.println("Student roll is " + roll);
		System.out.println("**************************");
	}

	Student(String name, int roll, int per) {
		System.out.println("Student name is " + name);
		System.out.println("Student roll is " + roll);
		System.out.println("Student per is " + per);
		System.out.println("**************************");
	}

	public static void main(String[] args) {
		Student s1 = new Student("Sumit", 4567);
		Student s2 = new Student("Issac", 5363, 99);
		Student s3 = new Student();
		s2.studentDetails();
		s1.studentDetails("Arvind", 434);
		s1.studentDetails("Bharathi", 434,88.99f);

	
		// Student s = new Student("Issac",5363,99);
	}

	// method

	public void studentDetails() {
		System.out.println("I am a method");
		System.out.println("**************************");
	}
	public void studentDetails(String name,int roll) {
		System.out.println("Student name is " + name);
		System.out.println("Student roll is " + roll);
		System.out.println("**************************");
	}
	
	public void studentDetails(String name,int roll,float per) {
		System.out.println("Student name is " + name);
		System.out.println("Student roll is " + roll);
		System.out.println("Student per is " + per);
		System.out.println("**************************");
	}

}
