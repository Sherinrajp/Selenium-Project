package page_package;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
WebDriver driver;
@FindBy(xpath="//*[@id=\"user-name\"]")WebElement username;
@FindBy(xpath="//*[@id=\"password\"]")WebElement password;
@FindBy(xpath="//*[@id=\"login-button\"]")WebElement loginbt;

public login_page(WebDriver driver)//constructor
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public String titlemth()//method
{
	String title=driver.getTitle();
	return title;
}

public void loginmth(String un,String pw) {
	username.sendKeys(un);
	password.sendKeys(pw);
	loginbt.click();
}
public String Urlmth() {
	String Actualurl=driver.getCurrentUrl();
	return Actualurl;
}
}
