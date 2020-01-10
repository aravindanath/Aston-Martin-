package day3;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class InnerLoops {

	public static void main(String[] args) {
		
		iloop: for(int i = 1;i<10;i++) {
		jloop:	for(int j=2;j<7;j++) {
				System.out.println(j);
				if(j==4&& i==4) {
					break jloop;
				}
			}
		}
		


	}

}
