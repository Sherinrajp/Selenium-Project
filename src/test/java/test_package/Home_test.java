package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_cls;

public class Home_test extends Base_cls{
	@Test(priority=1)
	public void textverify() {
		//loginobj.loginmth("standard_user","secret_sauce");//this call the login method to login the page for home page to open
		String producttxt=homeobj.textmth();
		Assert.assertEquals(producttxt,"Products");
	}
	@Test(priority=2)
	public void linkcnt() {
		int linkcount=homeobj.linkmthd();
		System.out.println("No of links:"+linkcount);
	}
	@Test(priority=3)
	public void cartmethod() {
		homeobj.cartmthd();
	}
}
