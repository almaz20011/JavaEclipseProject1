package packages.Project;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day4TestNg {
	@Parameters({"URL"})
	@Test
	public void WebloginHome(String urlname) {
		System.out.println("WebloginHome - Day4");
		System.out.println(urlname);
		
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan() {
		System.out.print("MobileloginHome - Day4");
	}
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("APIloginHome - Day4");
	}

}
