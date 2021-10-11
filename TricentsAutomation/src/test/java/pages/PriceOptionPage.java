package pages;

import org.openqa.selenium.By;

import Utils.Util;

public class PriceOptionPage extends Util{

	private By rdbPlatinum = By.xpath("//input[@id='selectplatinum']//following::span[1]");
	private By btnNext = By.id("nextsendquote");
	
	public void selectPlatinum() {
		clickElement(rdbPlatinum);
	}
	public void clickNext() throws InterruptedException {
		waitElementBePresent(btnNext, 10);
		scrollDown();
		clickElement(btnNext);
	}
}
