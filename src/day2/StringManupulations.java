package day2;

public class StringManupulations {
	
	
	public static void main(String[] args) {
		
		String city = "Bangalore";
		String name = "Arvind_45678909876_@#$%^&*( **^(*(";
		
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.replace("a", "@").replace("B", "M"));
		System.out.println(city.substring(0, 4).toUpperCase()+city.substring(4, 9));
		System.out.println(name.split("_")[0]);
		
		System.out.println(name.split("_")[1]);
		System.out.println(name.split(" ")[0]);
		System.out.println(name.split(" ")[1]);
		
		
	}

}
