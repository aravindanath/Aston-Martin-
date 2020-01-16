package assignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;


	public class WritePropertiesFile_Bharathi {
	public static void main(String[] args) throws IOException {
			
		String relativepath=System.getProperty("user.dir")+"/TestData/config_b.properties";
		System.out.println(relativepath);
		File file =new File(relativepath);
		Writer w=new FileWriter(file);
		Properties p=new Properties();  
		p.setProperty("name","bharathi.yerngula");  
		p.setProperty("email","bharathi.yernagula@gmail.com");  
		p.store(w,"Selenium Project Properties file");  
}
}