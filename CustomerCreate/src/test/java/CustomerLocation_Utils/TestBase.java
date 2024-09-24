package CustomerLocation_Utils;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import Utlity.ReadConfig;

public class TestBase {

  private WebDriver driver;
  public ReadConfig config;

  /**
   * @return the driver
   */
  public WebDriver getDriver() {
    return driver;
  }

  /**
   * @param driver
   *          the driver to set
   */
  public void setDriver(WebDriver driver) {
    this.driver = driver;
    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  public void setUp() throws Exception {
	  config = new ReadConfig(); 
	  String browserName = config.getBrowser();
	  if (browserName.equalsIgnoreCase("FirefoxFF")) {
		  System.setProperty("webdriver.gecko.driver", config.getProp("browserPathFolder") + "geckodriverFF.exe");
		  driver = new FirefoxDriver();
		  System.out.println("Firefox Driver Instance loaded successfully.");
	  }
	  else if (browserName.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", config.getProp("browserPathFolder") + "geckodriver.exe");
		  driver = new FirefoxDriver();
		  System.out.println("Firefox Driver Instance loaded successfully.");
	  } else if (browserName.equalsIgnoreCase("Firefox Nightly")) {
      System.setProperty("webdriver.gecko.driver", config.getProp("browserPathFolder") + "geckodriverNEW.exe");
      driver = new FirefoxDriver();
  	  System.out.println("Firefox Nightly Driver Instance loaded successfully.");
    } else if (browserName.equalsIgnoreCase("Chrome")) {
      System.setProperty("webdriver.chrome.driver", config.getProp("browserPathFolder") + "chromedriverUpdated.exe");
      driver = new ChromeDriver();
      System.out.println("Chrome Driver Instance loaded successfully.");
    } else if (browserName.equalsIgnoreCase("IE")) {
      System.setProperty("webdriver.ie.driver", config.getProp("browserPathFolder") + "IEDriverServer.exe");
      driver = new InternetExplorerDriver();
      System.out.println("IE Driver Instance loaded successfully.");
    }
     else {
      System.out.println(browserName + " Browser not supported.");
    }

    driver.manage().window().maximize();
    this.setDriver(driver);
    driver.get(this.config.getURL());

  }

}
