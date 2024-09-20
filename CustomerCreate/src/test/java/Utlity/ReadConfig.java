package Utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//@Author Mohammad Danish

public class ReadConfig {
	
	Properties properties;
	String path = "C:\\Users\\002G55744\\eclipse-workspace\\CustomerCreate_AutomationTesting\\Testdata\\config.properties";
	
	public  ReadConfig() throws Exception  {
		
		properties = new Properties();
		
		try {
			properties.load(new FileInputStream(path));
		}catch (IOException e) {
			System.out.println("Error to read");
		}
		
	}
	
		public String getURL() {
			return properties.getProperty("url");
			//return url;
			
		}
		
		public String getBrowser() {
	        return properties.getProperty("browser");
	    }
		
	
}

