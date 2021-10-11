package pages;

import java.awt.Robot;

import org.openqa.selenium.By;

import static java.awt.event.KeyEvent.*;
import utils.RobotWrite;
import utils.Util;

public class InsurantDataPage extends Util{

	private By inputFirstName = By.id("firstname");
	private By inputLastName = By.id("lastname");
	private By inputBirthDate = By.id("birthdate");
	private By rdbMale = By.xpath("//input[@id='gendermale']//following::span[1]");
	private By rdbFemale = By.xpath("//input[@id='genderfemale']//following::span[1]");
	private By inputStreetAddress = By.id("streetaddress");
	private By slcCountry = By.id("country");
	private By inputZipCode = By.id("zipcode");
	private By inputCity = By.id("city");
	private By slcOccupation = By.id("occupation");
	private By ckbSpeeding = By.xpath("//input[@id='speeding']//following::span[1]");
	private By ckbBungeeJumping = By.xpath("//input[@id='bungeejumping']//following::span[1]");
	private By ckbSkydiving = By.xpath("//input[@id='skydiving']//following::span[1]");
	private By inputWebsite = By.id("website");
	private By btnOpenPicture = By.id("open");
	private By btnNext = By.id("nextenterproductdata");
	
	public void fillFirstName(String fisrtName) {
		sendKeys(inputFirstName, fisrtName);
	}
	public void fillLastName(String lastName) {
		sendKeys(inputLastName, lastName);
	}
	public void fillBirthDate(String birthDate) {
		sendKeys(inputBirthDate, birthDate);
	}
	public void selectGender(String gender) {
		if(gender.equals("Male")) {
			clickElement(rdbMale);
		}else if(gender.equals("Female")) {
			clickElement(rdbFemale);
		}
	}
	public void fillStreetAddress(String streetAddress) {
		sendKeys(inputStreetAddress, streetAddress);
	}
	public void selectCountry(String value) {
		selectByValue(slcCountry, value);
	}
	public void fillZipCode(String zipCode) {
		sendKeys(inputZipCode, zipCode);
	}
	public void fillCity(String city) {
		sendKeys(inputCity, city);
	}
	public void selectOccupation(String value) {
		selectByValue(slcOccupation, value);
	}
	public void selectHobbies() {
		clickElement(ckbSpeeding);
		clickElement(ckbBungeeJumping);
		clickElement(ckbSkydiving);
	}
	public void fillWebsite(String website) {
		sendKeys(inputWebsite, website);
	}
	public void uploadPicture() throws Exception {
		clickElement(btnOpenPicture);
		Thread.sleep(1000);
		try{
	        RobotWrite rw = new RobotWrite();
	        rw.type("userPicture");
	        Robot r = new Robot();
	        r.keyPress(VK_ENTER);
	        r.keyRelease(VK_ENTER);
	    }catch (Exception e){
	        System.out.println("Could not write");
	        throw(e);
	    }
	}
	public void clickNext() {
		clickElement(btnNext);
	}
}
