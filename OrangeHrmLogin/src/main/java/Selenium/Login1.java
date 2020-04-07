package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Login1 {
	
	@Test
	public void loginpage() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.get("http://apps.qaplanet.in/hrm/login.php");
		Driver.findElementByName("txtUserName").sendKeys("qaplanet1");
		Driver.findElementByName("txtPassword").sendKeys("lab1");
		Driver.findElementByName("Submit").click();
		
		Driver.close();
		
	}

}
