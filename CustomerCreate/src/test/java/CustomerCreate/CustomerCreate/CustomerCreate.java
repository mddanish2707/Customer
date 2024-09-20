package CustomerCreate.CustomerCreate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utlity.ReadConfig;

//@author Mohammad Danish
public class CustomerCreate{
	private WebDriver driver;
	private ReadConfig config;
	
	@BeforeClass
	public void setUp() throws Exception {
		config = new ReadConfig();
		//System.setProperty("webdriver.firefox", "");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	@Test
	public void OpenUrl() {
		driver.get(config.getURL());
	}
	@AfterClass
    public void tearDown() {
        driver.quit();
    }
	
}