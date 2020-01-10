package day3;

public class ForEachLoop {
	
	public static void main(String[] args) {

	
		String arrayName [] = {"Kaveri","Arvind","Sumith","Issac"};
		
		for(String refName : arrayName) {
			if(refName.equals("Sumith")) {
				System.out.println("Found");
				break;
			}else {
				System.out.println("Not found");
			}
//			System.out.println(refName);
		}
		
	}

}
