package day5;

public class Kar extends MinOFEnv{

	public static void main(String[] args) {
		Kar k = new Kar();
		k.forestry();
		k.nationalParks();
		k.gardens();
		 
	}


	void forestry() {
		System.out.println("Kar forestry");
	}


	void nationalParks() {
		System.out.println("Kar National Parks");
		
	}


	@Override
	void example() {
	System.out.println("example");
		
	}

}
