package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {
WebDriver driver;

@FindBy(xpath="//*[@id=\"first-name\"]")WebElement firstnm;
@FindBy(xpath="//*[@id=\"last-name\"]")WebElement lastnm;
@FindBy(xpath="//*[@id=\"postal-code\"]")WebElement postal;
@FindBy(xpath="//*[@id=\"continue\"]")WebElement nxtpg;
public Checkout_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void entervalue() {
	firstnm.sendKeys("sherin");
	lastnm.sendKeys("raj");
	postal.sendKeys("670621");
	nxtpg.click();
}
}
