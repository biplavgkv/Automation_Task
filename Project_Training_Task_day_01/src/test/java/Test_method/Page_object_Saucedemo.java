package Test_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_base.BrowserPage;

public class Page_object_Saucedemo extends BrowserPage{

	@FindBy(name="user-name")
	WebElement Uname;

	@FindBy(name="password")
	WebElement pass;

	@FindBy(name="login-button")
	WebElement LogBtn;
	

	public Page_object_Saucedemo()
	{
		PageFactory.initElements(driver,this);
	}
   
	 public WebElement UserName()
	 {
		 return Uname;
	 }

	 public WebElement Password()
	 {
		return pass;
	 }

	 public WebElement loginbutton()
	 {
		 return LogBtn;
	 }
}
