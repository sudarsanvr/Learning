package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\Features\\Login.Feature"
		,tags={"@Smoketest , @Regressiontest"}
		,glue={"stepdefinition"}
		,format = {"pretty","html:test-output","json:json_output\\jsoncucumber.json","junit:junit_output\\xmlcucumber.xml"}
		,dryRun=false
		,monochrome=true
		,strict = true
		)
public class TestRunner {

}
