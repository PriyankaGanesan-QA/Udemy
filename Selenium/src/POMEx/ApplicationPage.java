package POMEx;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplicationPage {
	
	@Test
	void test() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
			
	driver.get("https://www.stealmylogin.com/demo.html");
	
	ObjectEx ab = new ObjectEx(driver);
	
	//ab.uname().sendKeys("priya");
	//ab.pname().sendKeys("test");
	//ab.btn().click();
	
	ab.Username.sendKeys("reena");
	ab.Password.sendKeys("test");
	ab.login.click();
	
	driver.close();
	
	}

}
