package pages;

import org.openqa.selenium.By;

import Utils.Util;

public class ProductDataPage extends Util{

	private By btnOpenCalendar = By.id("openstartdatecalender");
	private By btnNextMonth = By.xpath("//a[@title='Next']");
	private By btnDayOne = By.xpath("//a[text()='1']");
	private By slcInsuranceSum = By.id("insurancesum");
	private By slcMeritRating = By.id("meritrating");
	private By slcDamageInsurance = By.id("damageinsurance");
	private By ckbEuroProtection = By.xpath("//input[@id='EuroProtection']//following::span[1]");
	private By ckbLegalDefenseInsurance = By.xpath("//input[@id='LegalDefenseInsurance']//following::span[1]");
	private By slcCourtesyCar = By.id("courtesycar");
	private By btnNext = By.id("nextselectpriceoption");
	
	public void fillStartDate() {
		clickElement(btnOpenCalendar);
		clickElement(btnNextMonth);
		clickElement(btnNextMonth);
		clickElement(btnDayOne);
	}
	public void selectInsuranceSum(String value) {
		selectByValue(slcInsuranceSum, value);
	}
	public void selectMeritRating(String value) {
		selectByValue(slcMeritRating, value);
	}
	public void selectDamageInsurance(String value) {
		selectByValue(slcDamageInsurance, value);
	}
	public void selectOptionalProducts() {
		clickElement(ckbEuroProtection);
		clickElement(ckbLegalDefenseInsurance);
	}
	public void selectCourtesyCar(String value) {
		selectByValue(slcCourtesyCar, value);
	}
	public void clickNext() {
		clickElement(btnNext);
	}
	
}
