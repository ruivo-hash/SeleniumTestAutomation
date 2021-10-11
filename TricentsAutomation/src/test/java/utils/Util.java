package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends ChromeDriverUtil{

	public void getWindow(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void waitElementBePresent(By element , int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	 
	 public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 1000)");
    }
	
	 public boolean elementIsDisplayed(By element) {
		 return driver.findElement(element).isDisplayed();
	 }
	public void clickElement(By element) {
		driver.findElement(element).click();
	}
	public void selectByValue(By element, String value) {
		Select selectElement = new Select(driver.findElement(element));
		selectElement.selectByValue(value);
	}
	public void selectByIndex(By element, int index) {
		Select selectElement = new Select(driver.findElement(element));
		selectElement.selectByIndex(index);
	}
	public void sendKeys(By element ,String key) {
		driver.findElement(element).sendKeys(key);
	}
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
}
