package day6;

import java.io.File;
import java.io.IOException;

public class CreateNewFile_Arsha {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String relativePath = System.getProperty("user.dir")+"//TestData//demo.txt";
        System.out.println(relativePath);
        
        File file = new File(relativePath);
        
        if(!file.exists()) {
        	file.createNewFile();
        }else {
        	System.out.println("File is already created!");
        }
	}

}
