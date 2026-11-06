package test_package;

import org.testng.annotations.Test;

import base_package.Base_cls;

public class Payment_test extends Base_cls {
@Test(priority=1)
public void paymentpage() throws Exception {
	payobj.payscrn();
	payobj.endpage();
}
}
