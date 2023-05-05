package Testpage_method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import Test_base.BrowserPage;
import Test_method.Page_object_Saucedemo;

public class TestPage_SauceDemo extends BrowserPage
{
	Page_object_Saucedemo Po;

	@BeforeSuite
	public void launch() throws InterruptedException, IOException
	{
		LaunchingBrowser();
		Po  = new Page_object_Saucedemo();
	}

	@Test(priority=1)
	public void Login_validcredentials() throws InterruptedException 
	{
		Po.UserName().sendKeys(pros.getProperty("username1"));
		Po.Password().sendKeys(pros.getProperty("password"));
		Po.loginbutton().click();
		Thread.sleep(1000);
		driver.navigate().back();
		String actual = driver.getCurrentUrl();
		String excepted = "https://www.saucedemo.com/inventory.html";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual,excepted,"Title is not matched");
	}

	@Test(priority =2)
	public void Login_BlankUsername() throws InterruptedException
	{    
		Po.Password().sendKeys(pros.getProperty("password"));
		Po.loginbutton().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		String msg =driver.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']")).getText();
		String msgExpected="Epic sadface: Username is required";
		Assert.assertEquals(msg,msgExpected);
		}
	@Test(priority=3)
	public void Login_BlankPassword() throws InterruptedException

	{

		Po.UserName().sendKeys(pros.getProperty("username1"));
		Po.loginbutton().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@Test(priority=4)
	public void Diff_username2() throws InterruptedException
	{
		Po.UserName().sendKeys(pros.getProperty("username2"));
		Po.Password().sendKeys(pros.getProperty("password"));
		Po.loginbutton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

	@Test(priority=5)
	public void Diff_username3() throws InterruptedException
	{   

		Po.UserName().sendKeys(pros.getProperty("username3"));
		Po.Password().sendKeys(pros.getProperty("password"));
		Po.loginbutton().click();
		Thread.sleep(3000);
		driver.navigate().back();

	}
	@Test(priority =6)
	public void Diff_username4() throws InterruptedException
	{
		Po.UserName().sendKeys(pros.getProperty("username4"));
		Po.Password().sendKeys(pros.getProperty("password"));
		Po.loginbutton().click();
		Thread.sleep(2000);
		driver.navigate().back();

	}
	@Test(priority =7)
	public void Login_BlankCredential() throws InterruptedException
	{    

		Po.loginbutton().click();
		//driver.navigate().refresh();

	}
}
