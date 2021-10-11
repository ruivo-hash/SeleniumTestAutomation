package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {},
		features = "src/test/resources/features",
		tags = {"@fillFormToHireInsurance"},
		glue = {"steps"}
)
public class Test {

	protected static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void stop() {
		driver.quit();
	}
}
