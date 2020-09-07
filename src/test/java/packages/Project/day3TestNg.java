package packages.Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3TestNg {
	@Test(dataProvider="getData")
	public void MobileSignOutCarLoan(String username, String password) {
		System.out.println("Mobile SIGNOUT - Day3");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any methods in the class - Day3");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void urlProvider(String urlname,String key) {
		System.out.println("Here @Parameters({'URL'}) - Day3");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	
	
	@Test
	public void WebloginCarLoan() {
		System.out.println("Weblogincar - Day3");
		System.out.println();
	}
	

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("Mobilelogincar - Day3");
		
	}
	@Test(enabled=false)
	public void falseMethod() {
		System.out.println("False/Error Method - enabled - Day3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will execute before every test method in day 3 Class - Day3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I will execute after every test method in day 3 Class - Day3");
	}
	@Test(dependsOnMethods= {"WebloginCarLoan","MobileLoginCarLoan"})
	public void LoginAPIcarLoan() {
		System.out.println("APIlogincar - Day3");
	}
	
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I am number One - Day3");
	}
	@Test(timeOut=4000)
	public void timeExplicit() {
		System.out.print("Rest Assured max 5 sec connecting to Server, 'timeOut=40' - Day3");
	}
	
	
	@Test
	public void MobileLoginHome() {
		System.out.println("MobileLoginHome - Day3");
	}
	
	

	
	@DataProvider
	public Object[][] getData() {
		
		//1st set
		Object[][]data = new Object[3][2];
		data[0][0]="FirstSetUserName";
		data[0][1]="password";
		
		//2nd set
		data[1][0]="SecondSetUserName";
		data[1][1]="secondPassword";
		
       //3rd set
		data[2][0]="ThidSetUserName";
		data[2][0]="thirdPassword";
				
		return data;
		
		
		
	}
}
