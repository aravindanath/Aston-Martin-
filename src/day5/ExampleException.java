package day5;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ExampleException {

	public static void main(String[] args) {

		System.out.println("Starting...");

		try {
			// int i = 10;
			String j = "Sowmay";
			System.out.println(j.length());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("ending...");
		}

		System.out.println("quitting...");
	}

}
