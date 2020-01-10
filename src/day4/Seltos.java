package day4;

public class Seltos extends Car{

	public static void main(String[] args) {
		Seltos s = new Seltos();
		s.colour("Black");
		s.model("Seltos GT");
		s.headupDisplay();
		s.noiseCancelationSpeakers();

	}
	
	public void headupDisplay() {
		
		System.out.println("Head up display ");
	}

}
