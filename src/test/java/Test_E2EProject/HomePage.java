package Test_E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

import E2EProject.baseInternet;

public class HomePage extends baseInternet {
	
	@Test
	public void basePageNav() throws IOException {
		driver=initialDriver();
		driver.get("http://qaclickacademy.com");
	}
}
