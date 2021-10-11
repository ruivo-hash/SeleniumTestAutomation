package steps;

import cucumber.api.java.en.Given;
import pages.HomePage;

public class AccessAutomobileInsuranceSteps{

	HomePage home =  new HomePage();
	
	@Given("^that I in home page of Tricents site$")
	public void thatIInHomePageOfTricentsSite() {
		home.accessTricentisSite();
	}
	@Given("^access Automobile Insurance$")
	public void accessAutomobileInsurance() {
		home.clickAutomobileInsurance();
	}
}
