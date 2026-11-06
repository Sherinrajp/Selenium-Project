package page_package;



import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement textprdt;
	@FindBy(tagName="a")List<WebElement> links;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement cartbt;

	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String textmth() {
		String Actualtxt=textprdt.getText();
		return Actualtxt;
	}
	public int linkmthd() {
		int count=links.size();//.size() to get the total no of links 
		return count;
	}
	public  void cartmthd() {
		cartbt.click();
	}
}

