package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By imgTricents = By.id("tricentis_logo");
	private By txtAutomobile = By.id("nav_automobile");
	
	public void accessTricentisSite() {
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		Assert.assertEquals(true, driver.findElement(imgTricents).isDisplayed());
	}
	public void clickAutomobileInsurance() {
		driver.findElement(txtAutomobile).click();
	}
}
