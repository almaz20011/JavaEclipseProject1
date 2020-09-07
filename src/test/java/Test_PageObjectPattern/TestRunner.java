package Test_PageObjectPattern;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/almaz/eclips-2020/Project/src/test/java/login.feature",
		glue = "stepDefinition")
public class TestRunner{
	
}
