package packages.Project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class day1TestNg {
	
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last - Day1");
		
	}
	
	@Test
	public void Demo() {
		System.out.println("hello - Day1");
		AssertJUnit.assertTrue(true);
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I am the Number One From Last - Day1");
		
	}
	@Test
	public void SecondTest() {
		System.out.println("bye - Day1");
	}

}
