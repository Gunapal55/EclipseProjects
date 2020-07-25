package com.elf.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx; //declaration
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;

	public void setLogin(String un,String pw) { //business logic method
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw); //utilisation
	lgbtn.click();
	}
}
