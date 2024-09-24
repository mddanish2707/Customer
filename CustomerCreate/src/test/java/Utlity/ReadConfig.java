package Utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ReadConfig {
	
	Properties properties;
	String path = "C:\\Users\\003VQD744\\Documents\\GitHub\\Customer\\CustomerCreate\\Testdata\\config.properties";
	
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
			
		}
		
		public String getBrowser() {
	        return properties.getProperty("browser");
	    }
		
		public String getProp(String keyToSearch)
		{
			return properties.getProperty(keyToSearch);
		}
		
	
}

