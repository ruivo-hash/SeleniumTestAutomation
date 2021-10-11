package pages;

import org.openqa.selenium.By;

import utils.Util;

public class SendQuotePage extends Util{
	
	private By inputEmail = By.id("email");
	private By inputPhone = By.id("phone");
	private By inputUserName = By.id("username");
	private By inputPassword = By.id("password");
	private By inputConfirmPassword = By.id("confirmpassword");
	private By btnSend = By.id("sendemail");
	private By txtSuccess = By.xpath("//h2");
	
	public void fillEmail(String email) {
		sendKeys(inputEmail, email);
	}
	public void fillPhone(String phone) {
		sendKeys(inputPhone, phone);
	}
	public void fillUserName(String userName) {
		sendKeys(inputUserName, userName);
	}
	public void fillPassword(String password) {
		sendKeys(inputPassword, password);
	}
	public void fillConfirmPassword(String password) {
		sendKeys(inputConfirmPassword, password);
	}
	public void clickSend() {
		clickElement(btnSend);
	}
	public String getSuccessMessage() {
		waitElementBePresent(txtSuccess, 15);
		return getText(txtSuccess);
	}
}
