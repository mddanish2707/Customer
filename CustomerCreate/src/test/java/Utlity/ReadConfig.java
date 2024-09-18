package Utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStream;
import java.util.Properties;

//import com.google.j2objc.annotations.Property;

public class ReadConfig {
	
	Properties properties;
	String path = "C:\\Users\\002G55744\\eclipse-workspace\\CustomerCreate_AutomationTesting\\Testdata\\config.properties";
	
	public  ReadConfig() throws Exception  {
		
		properties = new Properties();
		
		//FileInputStream fis = new FileInputStream(path);
		System.out.println("i am here");
		try {
			FileInputStream fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
		
	
		public String getURL() {
			String  url = properties.getProperty("url");
			return url;
			
		}
		
	
}

