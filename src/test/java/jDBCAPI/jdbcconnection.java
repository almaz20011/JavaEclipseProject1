package jDBCAPI;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myFirstTable","root","Bishkek11");
		
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jwdb?useTimezone=true&serverTimeZone=UTC","/myFirstTable","root","Bishkek11");
		Statement s= con.createStatement();
		
		
		ResultSet rs = s.executeQuery("select name,location from Employeeinfo where id='5'");
		while(rs.next()) {
			System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			
//			WebDriver driver = new ChromeDriver();
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(rs.getString("name"));
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys(rs.getString("location"));
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	
//		System.out.println(rs.getString("name"));
//		System.out.println(rs.getString("age"));
		}
		
	}

}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class jdbcconnection {
//
//	public static void main(String[] args) throws SQLException {
//		String host = "localhost";
//		String port = "3306";
//		
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://"+ host +":" + port + "/QAdbt", "root", "Bishkek11");
//		
//		Statement s = con.createStatement();
//		
//		ResultSet rs = s.executeQuery("select * from Employeeinfo where location = 'newjersey'");
//		
//		while(rs.next()) {
//			System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://login.salesforce.com");
//			driver.findElement(By.cssSelector("[id='username']")).sendKeys(rs.getString("name"));
//			driver.findElement(By.cssSelector("[id='password']")).sendKeys(rs.getString("location"));
//		
//		}
//
//	}
//
//}