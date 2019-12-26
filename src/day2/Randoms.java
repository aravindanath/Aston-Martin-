package day2;

import java.util.Random;

public class Randoms {

	public static void main(String[] args) {

		Randoms r = new Randoms();

		System.out.println(r.randomMobile());

	}

	public long randomMobile() {
		double d = Math.random();
		long mob = (int) (d * 888899999) * 5;
		return mob;
	}

}
