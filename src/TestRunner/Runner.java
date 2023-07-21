package TestRunner;		


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;		

				
@CucumberOptions(features="Feature",glue="src/StepDefinition/Steps",
monochrome=true,plugin= {"html:target/cuucumber.html"})
public class Runner extends AbstractTestNGCucumberTests				
{		

}