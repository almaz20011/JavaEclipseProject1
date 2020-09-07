package ObjectRepository_PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
  WebDriver driver;
  
  public RediffHomePage(WebDriver driver) {

		this.driver = driver;
	}
  
  By shoppingElement = By.cssSelector("[title='Online Shopping']");
  By searchBoxElement = By.id("srchword");
  By submitElement = By.cssSelector(".newsrchbtn");
  
  public WebElement shopping() {
	  return driver.findElement(shoppingElement);
  }
  
  public WebElement inputSearch() {
	  return driver.findElement(searchBoxElement);
  }
  
  public WebElement submit() {
	  return driver.findElement(submitElement);
  }
  
  
}

