package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;

	public LoginPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);

	}
	//business logic method
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	}
