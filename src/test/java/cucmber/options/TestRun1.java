package cucmber.options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/feature"},glue= {"stepDefinition"},plugin= {"pretty", "html:target/cucmber-reports"})

public class TestRun1 {

	
	
}
