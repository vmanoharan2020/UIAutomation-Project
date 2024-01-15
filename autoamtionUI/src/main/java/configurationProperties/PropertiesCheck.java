package configurationProperties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCheck {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		
		//Properties prop = new Properties(fis);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String uName = prop.getProperty("username");
		
		System.out.println(uName);
		
		
	}

}
