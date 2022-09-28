package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue= "StepDefeinition",
		plugin= {"pretty",
				"junit:target/NOPMyReport/report.xml",
				"json:target/NOPMyReport/report.json"},
		publish= true,
		monochrome= true
	
				
		
		
		
		
		)



public class UpdatedNOPTestRunner {

}
