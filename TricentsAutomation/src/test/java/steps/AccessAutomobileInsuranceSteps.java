package steps;

import cucumber.api.java.en.Given;
import pages.HomePage;
import runner.Test;

public class AccessAutomobileInsuranceSteps  extends Test{

	HomePage home =  new HomePage(driver);
	
	@Given("^that I in home page of Tricents site$")
	public void thatIInHomePageOfTricentsSite() {
		home.accessTricentisSite();
	}
	@Given("^access Automobile Insurance$")
	public void accessAutomobileInsurance() {
		home.clickAutomobileInsurance();
	}
}
