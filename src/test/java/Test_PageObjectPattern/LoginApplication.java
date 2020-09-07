package Test_PageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository_PageObjectPattern.RediffHomePage;
import ObjectRepository_PageObjectPattern.RediffLoginPage;

public class LoginApplication {
	
	WebDriver driver;
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		
		
		
		
		
		
		//First Class/RediffLoginPage - running first
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.WebElementSignIn().click();
		rd.getUsername().sendKeys("Hello");
		rd.getPassword().sendKeys("Hello");
		rd.getLogin().click();
		rd.getBack().click();
		
		//Second Class/RediffHomePage - running sequantly 
		RediffHomePage rh = new RediffHomePage(driver);
		rh.shopping().click();
		rh.inputSearch().sendKeys("Smart Watch");
		rh.submit().click();
		

		
		
	}
	public LoginApplication(WebDriver driver) {
		
		this.driver = driver;
	}
	
}
