package page_package;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.io.FileHandler;
public class Payment_page {
WebDriver driver;

@FindBy(xpath="//*[@id=\"finish\"]")WebElement finish;

public Payment_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	



public void payscrn() throws Exception {
    File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sc,new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium works\\Screenshot\\swaglab.png"));
}
public void endpage() {
	finish.click();
}
}
