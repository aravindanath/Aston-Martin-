package day3;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		String name[] = {"Sumit","Arivnd","Sowmya","Bharathi","Joshi"};
		
		for(String ref : name) {
//			System.out.println(ref);
			if(ref.contains("Arivnd")) {
				System.out.println("found");
				break;
			}else {
				System.out.println("Not found");
			}
		}
		
	}

}
