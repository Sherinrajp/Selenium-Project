package base_package;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.Checkout_page;
import page_package.Home_page;
import page_package.Payment_page;
import page_package.cart_page;
import page_package.login_page;

public class Base_cls {
public static WebDriver driver ;
public login_page loginobj;
public Home_page homeobj;
public cart_page cartobj;
public Checkout_page chckobj;
public Payment_page payobj;
@BeforeTest
public void open() {
	ChromeOptions options =new ChromeOptions();//used to change password popup open in incognito
	options.addArguments("--incognito");
	driver=new ChromeDriver(options);
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
}
@BeforeMethod
public void objmth() {
	loginobj=new login_page(driver);
	homeobj=new Home_page(driver);
	cartobj=new cart_page(driver);
	chckobj=new Checkout_page(driver);
	payobj=new Payment_page(driver);
}

}
