package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
}
public static void main(String[] args) {
	//open the chrome browser
	WebDriver driver=new ChromeDriver();
	//enter the url
	driver.get("https://demo.actitime.com/");
	//inspect login button and find x path
Dimension loginbtn =driver.findElement(By.xpath("//div[.='Login ']")).getSize();
//call getHeight & width
		int height =loginbtn.getHeight();
		int width = loginbtn.getWidth();
		//height and width will be interms of pixeles 
		System.out.println("Height is ="+height);
		System.out.println("Width is ="+width);
		System.out.println(loginbtn);
		driver.close();
}
}