package test_package;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_cls;

public class login_test extends Base_cls{

	@Test(priority=1)
	public void titleverify() 
		{
			String actualtitle=loginobj.titlemth();
			Assert.assertEquals(actualtitle,"Swag Labs");
		}
		@Test(priority=2)
		public void loginvalid() {
			loginobj.loginmth("standard_user","secret_sauce");
		}
		@Test(priority=3)
		public void urlvalidation() {
			String homeurl=loginobj.Urlmth();
			System.out.println("Home Url:"+homeurl);
			//Assert.assertEquals(homeurl,"https://www.saucedemo.com/inventory.html");1st method to check url
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));//2nd method urlcontains also used to check a word in it
		}
		
	}
