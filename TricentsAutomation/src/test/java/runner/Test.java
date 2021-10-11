package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.ChromeDriverUtil;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/reports/cucumberReport.json", "html:target/reports"},
		features = "src/test/resources/features",
		tags = {"@fillFormToHireInsurance"},
		glue = {"steps"}
)
public class Test {
	
	@BeforeClass
	public static void start() {
		ChromeDriverUtil.InitializeChromeDriver();
	}
	
	@AfterClass
	public static void stop() {
		ChromeDriverUtil.closeWindow();
	}
}
