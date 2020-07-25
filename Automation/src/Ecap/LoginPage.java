package Ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx; //declaration
	private WebElement pwtbx;
	private WebElement lgbtn;


	public LoginPage(WebDriver driver) {
	untbx = driver.findElement(By.id("username")); //initialisatiton
	pwtbx=driver.findElement(By.name("pwd"));
	lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setLogin(String un,String pw) { //business logic method
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
	}
}
