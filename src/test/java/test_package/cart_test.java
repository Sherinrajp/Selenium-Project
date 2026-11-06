package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_cls;

public class cart_test extends Base_cls{

	@Test(priority=1)
	public void cartbtclck() {
		cartobj.cartbt();
	}
	@Test(priority=2)
	public void txtcheck() {
		String txt=cartobj.textverify();
		Assert.assertEquals(txt,"Your Cart");
	}
	@Test(priority=3)
	public void nxtpage() {
		cartobj.checkout();
	}
}
