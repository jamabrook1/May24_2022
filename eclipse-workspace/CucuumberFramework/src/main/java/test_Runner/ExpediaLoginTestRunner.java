package test_Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\expedia\\feature_files\\testEx.feature",
			glue ={"com\\expedia\\step_definitions\\LoginWithValidData.java"},
			monochrome = true
			//dryRun=true
			)


public class ExpediaLoginTestRunner {
	

}
