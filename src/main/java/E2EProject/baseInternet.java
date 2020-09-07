package E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseInternet  {
	
	public WebDriver driver;
	
	public WebDriver initialDriver()throws IOException {
		
	
	Properties prop = new Properties();
	

	FileInputStream  fis = new FileInputStream("/Users/almaz/eclips-2020/Project/src/main/java/E2EProject/data.properties");
	
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	}else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/almaz/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
	}else if(browserName.equals("IE")) {
		
	}
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
   }
}