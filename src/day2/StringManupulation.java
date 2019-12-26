package day2;

public class StringManupulation {

	public static void main(String[] args) {

		String city = "BangaLore_84992923";

		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.replace("a", "@"));
		System.out.println(city.split("_")[0]);
		System.out.println(city.split("_")[1]);
		System.out.println(city.substring(0, 4).toUpperCase() + city.substring(4, 9));
		System.out.println(city.length());

		String browser = "Chrome";
		String lbrowser = "chrome";
		System.out.println(browser == lbrowser);
		System.out.println(10 == 12);
		System.out.println(browser.hashCode());
		System.out.println(lbrowser.hashCode());

		if (browser.equals("chrome")) {
			System.out.println("execute on chrome");
		} else if (browser.equalsIgnoreCase("cHrOme")) {
			System.out.println("execute on cHrOme");
		}

	}

}
