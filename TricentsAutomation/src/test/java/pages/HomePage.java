package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import utils.Util;

public class HomePage extends Util{
	
	private By imgTricents = By.id("tricentis_logo");
	private By txtAutomobile = By.id("nav_automobile");
	
	public void accessTricentisSite() {
		getWindow("http://sampleapp.tricentis.com/101/index.php");
		Assert.assertEquals(true, elementIsDisplayed(imgTricents));
	}
	public void clickAutomobileInsurance() {
		clickElement(txtAutomobile);
	}
}
