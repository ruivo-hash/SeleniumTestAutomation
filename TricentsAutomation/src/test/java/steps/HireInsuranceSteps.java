package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InsurantDataPage;
import pages.PriceOptionPage;
import pages.ProductDataPage;
import pages.SendQuotePage;
import pages.VehicleDataPage;

public class HireInsuranceSteps{

	VehicleDataPage vehicle = new VehicleDataPage();
	InsurantDataPage insurant = new InsurantDataPage();
	ProductDataPage product = new ProductDataPage();
	PriceOptionPage price = new PriceOptionPage();
	SendQuotePage quote = new SendQuotePage();
	
	@When("^I fill form of Vehicle Data$")
	public void iFillFormOfVehicleData() {
		vehicle.selectMake("BMW");
		vehicle.fillEnginePerformance("1000");
		vehicle.fillManufactureDate();
		vehicle.selectNumberSeats(5);
		vehicle.selectFuelType("Gas");
		vehicle.fillListPrice("50000");
		vehicle.fillAnnualMileage("10000");
		vehicle.clickNext();
	}

	@When("^fill form of Insurant Data$")
	public void fillFormOfInsurantData() {
		insurant.fillFirstName("Mateus");
		insurant.fillLastName("Balduino");
		insurant.fillBirthDate("01/16/2001");
		insurant.selectGender("Male");
		insurant.fillStreetAddress("Rua Avenida Rodovia");
		insurant.selectCountry("Brazil");
		insurant.fillZipCode("12345");
		insurant.fillCity("Barueri");
		insurant.selectOccupation("Employee");
		insurant.selectHobbies();
		insurant.fillWebsite("https://github.com/ruivo-hash");
		insurant.clickNext();
	}

	@When("^fill form of Product Data$")
	public void fillFormOfProductData() {
		product.fillStartDate();
		product.selectInsuranceSum("5000000");
		product.selectMeritRating("Malus 17");
		product.selectDamageInsurance("Full Coverage");
		product.selectOptionalProducts();
		product.selectCourtesyCar("Yes");
		product.clickNext();
	}

	@When("^select a Price Option$")
	public void selectAPriceOption() throws InterruptedException {
		price.selectPlatinum();
		price.clickNext();
	}

	@When("^send a quote$")
	public void sendAQuote() {
		quote.fillEmail("mateus@email.com");
		quote.fillPhone("123456789");
		quote.fillUserName("ruivo");
		quote.fillPassword("Mateus01");
		quote.fillConfirmPassword("Mateus01");
		quote.clickSend();
	}

	@Then("^I validate the success message$")
	public void iValidateTheSuccessMessage() {
		Assert.assertEquals("Sending e-mail success!", quote.getSuccessMessage());
	}
}
