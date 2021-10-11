package pages;

import org.openqa.selenium.By;

import utils.Util;

public class VehicleDataPage extends Util{
	
	private By formInsurance = By.id("insurance-form");
	private By slcMake = By.id("make");
	private By inputEnginePerformance = By.id("engineperformance");
	private By btnOpenCalendar = By.id("opendateofmanufacturecalender");
	private By btnPrev = By.xpath("//a[@title='Prev']");
	private By btnDayOne = By.xpath("//a[text()='1']");
	private By slcSeats = By.id("numberofseats");
	private By slcFuelType = By.id("fuel");
	private By inputListPrice = By.id("listprice");
	private By inputLicensePlateNumber = By.id("licenseplatenumber");
	private By inputAnnualMileage = By.id("annualmileage");
	private By btnNext = By.id("nextenterinsurantdata");
	
	
	public void selectMake(String make) {
		waitElementBePresent(formInsurance, 10);
		selectByValue(slcMake, make);
	}
	public void fillEnginePerformance(String kW) {
		sendKeys(inputEnginePerformance, kW);
	}
	public void fillManufactureDate() {
		clickElement(btnOpenCalendar);
		clickElement(btnPrev);
		clickElement(btnDayOne);
	}
	public void selectNumberSeats(int numSeats) {
		selectByIndex(slcSeats, numSeats);
	}
	public void selectFuelType(String value) {
		selectByValue(slcFuelType, value);
	}
	public void fillListPrice(String price) {
		sendKeys(inputListPrice, price);
	}
	public void fillLicensePlateNumber(String license) {
		sendKeys(inputLicensePlateNumber, license);
	}
	public void fillAnnualMileage(String mileage) {
		sendKeys(inputAnnualMileage, mileage);
	}
	public void clickNext() {
		clickElement(btnNext);
	}
}
