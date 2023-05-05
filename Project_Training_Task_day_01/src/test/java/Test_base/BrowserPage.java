package Test_base;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class BrowserPage {
	public static WebDriver driver;
	public static Properties pros;
	public  void LaunchingBrowser() throws InterruptedException, IOException
	{
		
		//Launching the webBrowser 
		try
		{
			FileInputStream F = new FileInputStream("D:\\workspace\\Project_Training_Task_day_01\\src\\test\\java\\configSauceDemo.properties");
			pros = new Properties();
			pros.load(F);
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("----file not found ");
		}
		WebDriverManager.chromedriver().setup();  
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pros.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
		
	//quit the browser page
	
	public void teardown()
		{
			driver.quit();
		}
	
}
