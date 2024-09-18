package CustomerCreate.CustomerCreate;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import Utlity.ReadConfig;
//import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

// https://cirdc-custcr-ui-request-uat.wdc1a.ciocloud.nonprod.intranet.ibm.comimport java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;
public class CustomerCreate {

	
	//@BeforeTest  
	public static void main(String args[]) throws Exception {
		WebDriver driver;			
		driver = new FirefoxDriver();
		
		ReadConfig ConfigFile = new ReadConfig();
		driver.get(ConfigFile.getURL());
//		ReadConfig config;
//		config = new ReadConfig();
//		System.out.println(config.LoginUrl());
//		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files");
//		
//		
//		driver.get("C:\\Users\\002G55744\\eclipse-workspace\\CustomerCreate_AutomationTesting\\Testdata\\config.properties");
//		
//		
		
		
		
	}
}
