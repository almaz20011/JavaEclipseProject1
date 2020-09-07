package ObjectRepository_PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
  WebDriver driver;
  
  public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
	}
  
  By signIn = By.xpath("//*[@class='signin']");
  By username = By.id("login1");
  By password = By.name("passwd");
  By login = By.cssSelector("[class='signinbtn']");
  By goback = By.linkText("linkText");


  
 public WebElement WebElementSignIn() {
	 return driver.findElement(signIn);
 }


public WebElement getUsername() {
	return driver.findElement(username);
}




public WebElement getPassword() {
	return driver.findElement(password);
}




public WebElement getLogin() {
	return driver.findElement(login);
}

public WebElement getBack() {
	return driver.findElement(goback);
}





}
