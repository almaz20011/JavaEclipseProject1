package RestassuredAutomation;

import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TC001_GET_Request {
	
	@Test
	void test_01() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString() + " - asString()");
		System.out.println(response.getBody() + " - getBody()");
		System.out.println(response.getStatusCode()+ "- getStatusCode()");
		System.out.println(response.getStatusLine() + " - getStatusLine");
		System.out.println(response.getHeader("content-type")+ " - getHeader('content-type')");
		System.out.println(response.getTime() + "- getTime()");
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
}
