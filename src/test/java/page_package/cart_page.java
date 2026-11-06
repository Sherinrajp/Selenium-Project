package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_page {
WebDriver driver;

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") WebElement cartclk;
@FindBy(xpath="//*[@id=\"header_container\"]/div[2]")WebElement yourcrt;
@FindBy (xpath="//*[@id=\"checkout\"]") WebElement checkoutbt;


public cart_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void cartbt() {
	cartclk.click();
}

public String textverify(){
	String actualtxt=yourcrt.getText();
	return actualtxt;
}
public void checkout() {
	checkoutbt.click();
}

}
