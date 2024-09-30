package Utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

<<<<<<< Updated upstream
//@Author Mohammad Danish
=======
//Author @Mohammad Danish & @kritika Basak
>>>>>>> Stashed changes

public class ReadConfig {
	
	Properties properties;
<<<<<<< Updated upstream
	String path = "C:\\Users\\002G55744\\eclipse-workspace\\CustomerCreate_AutomationTesting\\Testdata\\config.properties";
=======
	String path = "C:\\personal git\\Customer\\CustomerCreate\\Testdata\\config.properties";
>>>>>>> Stashed changes
	
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

