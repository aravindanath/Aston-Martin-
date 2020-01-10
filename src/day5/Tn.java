package day5;

public class Tn extends MinOFEnv {

	public static void main(String[] args) {
		 
		Tn  t = new Tn();
		t.forestry();
		t.nationalParks();
	}

	 
	void forestry() {
		System.out.println("TN forestry");
	}


	void nationalParks() {
		System.out.println("TN NP");
		
	}


	@Override
	void example() {
		System.out.println("example");
		
	}

}
