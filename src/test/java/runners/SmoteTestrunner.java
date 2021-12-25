package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features= "Features",// Gherkin syntext
		  glue="steps"// glue point to the step def package
		)




public class SmoteTestrunner extends AbstractTestNGCucumberTests{
	
	
	
	

}
