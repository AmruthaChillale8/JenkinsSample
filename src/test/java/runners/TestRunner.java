package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\camrutha\\eclipse-workspace\\Jenkins\\src\\test\\java\\features", glue = {"steps"}, tags = "@browserPOCFunctionality")
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}

