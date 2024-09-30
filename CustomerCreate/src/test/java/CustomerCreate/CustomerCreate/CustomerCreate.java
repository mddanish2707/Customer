package CustomerCreate.CustomerCreate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utlity.ReadConfig;
import java.util.Properties;
import CustomerLocation_Utils.TestBase;




public class CustomerCreate extends TestBase{

	private WebDriver driver;
	private ReadConfig config;
	private TestBase testBase;
	
	@BeforeClass
	public void setUp() throws Exception {
		config = new ReadConfig();
		testBase = new TestBase();
		testBase.setUp();    
		driver = testBase.getDriver();
        
	}
	@Test
	public void OpenUrl() {
		driver.get(config.getURL());
	}


	@AfterClass
   public void tearDown() {
		if (driver != null) {
       driver.quit();
		}
   }

}