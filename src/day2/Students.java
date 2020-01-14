package day2;

public class Students {
	
	public static void main(String[] args) {
		
		
		Students st = new Students();
		st.studentsDetails("Krishna", 463, 88.00f, "Trupathi", 'M');
//		InstanceLocalVariable.employee("Sowmya");
		InstanceLocalVariable i = new InstanceLocalVariable();
		i.students("Kaveri");
		i.employee("Vetri");
		
	}
	
	public void studentsDetails(String name, int roll, float per,String city,char gender) {
		System.out.println("Student name is "+ name);
		System.out.println("Student roll is "+ roll);
		System.out.println("Student gender is "+ gender);
		System.out.println("Student has secured  "+ per);
		System.out.println("Student is from "+ city);
	}

}
