package utitliespackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Readconfiguration {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "FeatureBDD",
			glue = "stepDefinitions",
			dryRun= false,
			monochrome = true, 
			plugin = {"pretty","htlm:target/cucumber-reports/reports_htlm.htlm"}
			
			
			)
	public class Run
	{
		//Emptyclass
	}
	

}
