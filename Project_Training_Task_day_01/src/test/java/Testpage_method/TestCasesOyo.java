package Testpage_method;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import Test_base.BrowserPage;
import Test_method.Homepage_Element;
public class TestCasesOyo extends BrowserPage {
	Homepage_Element HE;
	
	@BeforeSuite
	public void launch() throws InterruptedException, IOException
	{
		LaunchingBrowser();
		HE = new Homepage_Element ();
	}

	@Test
	public void clicked()
	{
		HE.clicked().click();
	}
  @Test
  public void Logo_visibility() {
	  boolean logoChecking = HE.Logo().isDisplayed();
	  System.out.println(logoChecking);
	  
	  
  }
  @Test
  public void Bmember_visibility()
  {
	  boolean bmember =HE.BecomeMember().isDisplayed();
	  System.out.println(bmember);
  }
  @Test
  public void oyoBusiness_visibiltiy()
  {
	  boolean OyoB =HE.OyoMember().isDisplayed();
	  System.out.println(OyoB);
  }
  @Test
  public void listproperty_Visibility()
  {
	  boolean Lproperty = HE.ListProperty().isDisplayed();
			  System.out.println(Lproperty);
  }
  @Test
  public void CallUs_Visibility()
  {
	  boolean Calls =  HE.CallUs().isDisplayed();
	  System.out.println(Calls);
  }

  @Test(priority=1)
  public void CityInbangalore() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  act.moveToElement(HE.bang()).perform();
	  int No_of_Cities =HE.CitiesBlr().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesBlr().get(i).getText();
	  System.out.println(NAMES);
	  }
  }

  
  @Test(priority=1)
  public void CityInchennai() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  act.moveToElement(HE.chen()).perform();
	  int No_of_Cities =HE.CitiesCHN().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesCHN().get(i).getText();
	  System.out.println(NAMES);
	  }
  }

  @Test(priority=1)
  public void CityIndelhi() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.moveToElement(HE.del()).perform();
	  int No_of_Cities =HE.CitiesDLH().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesDLH().get(i).getText();
	  System.out.println(NAMES);
	  }
  }
 
  @Test(priority=1)
  public void CityInGurgaon() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.moveToElement(HE.gur()).perform();
	  int No_of_Cities =HE.CitiesGRN().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesGRN().get(i).getText();
	  System.out.println(NAMES);
	  }
	  
	  
  }

  @Test(priority=1)
  public void CityInHyderabad() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.moveToElement(HE.Hyb()).perform();
	  int No_of_Cities =HE.CitiesHYB().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesHYB().get(i).getText();
	  System.out.println(NAMES);
	  }

  }

  @Test(priority=1)
  public void CitiesInKolkata() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.moveToElement(HE.KOL()).perform();
	  int No_of_Cities =HE.CitiesKOL().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesKOL().get(i).getText();
	  System.out.println(NAMES);
	  }
	  
  }
  @Test(priority=1)
  public void CitiesInMumbai() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.moveToElement(HE.MUM()).perform();
	  int No_of_Cities =HE.CitiesMUM().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesMUM().get(i).getText();
	  System.out.println(NAMES);
	  }
	  
  }

  @Test(priority=1)
  public void citiesInNOIDA() throws InterruptedException
  {
	  
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.moveToElement(HE.NOD()).perform();
	  int No_of_Cities =HE.CitiesNOD().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesNOD().get(i).getText();
	  
	  System.out.println(NAMES);
	  Thread.sleep(2000);
	  }
	  Thread.sleep(2000);
  
	  
  }
  @Test(priority=1)
  public void CitiesInpune() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  
	  act.moveToElement(HE.PUN()).perform();
	  int No_of_Cities =HE.CitiesPUN().size();
	  for(int i =0;i<No_of_Cities;i++)
	  {
	  String NAMES =HE.CitiesPUN().get(i).getText();
	  System.out.println(NAMES);
	  }
	  
  }
  @Test(priority=2)
  public void search() throws InterruptedException
  {   
	  WebElement x = HE.Searchbox();
	  Actions act1= new Actions(driver);
	  Thread.sleep(2000);
	  act1.moveToElement(x).click(x).sendKeys("Jharkhand").perform();
	  
  }
  @Test(dependsOnMethods="search",priority=2)
  public void selectPlaceFromlist() throws InterruptedException
  {
	  Actions act2 = new Actions(driver);
	  Thread.sleep(2000);
	  act2.moveToElement(HE.selectPlace()).click().perform();
  }
  @Test(dependsOnMethods="selectPlaceFromlist",priority=2)
  public void clckcalen() throws InterruptedException
  {
	  Actions act4 = new Actions(driver);
	  Thread.sleep(2000);
	  act4.moveToElement(HE.clickCalenn()).click().perform();
  }
  @Test(dependsOnMethods="clckcalen",priority=2)
  public void datePickCalendar() throws InterruptedException
  {
	  Actions act3 = new Actions(driver);
	  Thread.sleep(2000);
	  act3.moveToElement(HE.DatePicker()).click().perform();
	  
  }

  @Test(dependsOnMethods="datePickCalendar",priority=2)
  public void date() throws InterruptedException
  {
	  Actions act4 = new Actions(driver);
	  Thread.sleep(2000);
	  act4.moveToElement(HE.date()).click(HE.date()).perform();
  }
  
  @Test(dependsOnMethods="date",priority=2)
  public void date2() throws InterruptedException
  {
	  Actions act5 = new Actions(driver);
	  Thread.sleep(2000);
	  act5.moveToElement(HE.date2()).click(HE.date2()).build().perform();
	  Thread.sleep(2000);
  }
  
  @Test(priority=3)
  public void SelectingRoom() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Actions act6= new Actions(driver);
	  act6.moveToElement(HE.roomSelect()).click(HE.roomSelect()).perform();
	 
  }
  
  @Test(dependsOnMethods="SelectingRoom",priority=3)
  public void incroom() throws InterruptedException
  {
	  Actions act7= new Actions(driver);
	  act7.moveToElement(HE.Inc()).click().perform();
	 
  }
  @Test(dependsOnMethods="incroom",priority=3)
  public void decroom() throws InterruptedException
  {
	  Actions act8= new Actions(driver);
	  act8.moveToElement(HE.dec()).click().perform();
	 
  }
  
  @Test(dependsOnMethods="decroom",priority=3)
  public void AddRooms() throws InterruptedException
  {
	  Actions act9= new Actions(driver);
	  act9.moveToElement(HE.addroom()).click().perform();
	 
  }
  
  @Test(dependsOnMethods="AddRooms",priority=3)
  public void DelRooms() throws InterruptedException
  {
	  Actions act10= new Actions(driver);
	  act10.moveToElement(HE.delroom()).click().perform();
	 
  }
  
  @Test(dependsOnMethods="DelRooms",priority=3)
  public void sea() throws InterruptedException
  {
	  Actions act11= new Actions(driver);
	  act11.moveToElement(HE.searchButton()).click().perform();
	 
  }
  @Test(dependsOnMethods="sea",priority=4)
  public void mapviewbox()
  {
	  Actions act12= new Actions(driver);
	  act12.moveToElement(HE.MapView()).click().perform();
	  
  }
  @Test(dependsOnMethods="mapviewbox",priority=4)
  public void searchboxinside() throws InterruptedException
  {
	  WebElement x2 = HE.SearchboxIn();
	  Actions act13= new Actions(driver);
	  Thread.sleep(1000);
	  act13.moveToElement(x2).click(x2).sendKeys("Bistupur").perform();
  }
  @Test(dependsOnMethods="searchboxinside",priority=4)
  public void bistupurG() throws InterruptedException
  {

	  WebElement x2 = HE.bistupur();
	 Actions act14 = new Actions(driver);
	 Thread.sleep(1000);
	 act14.moveToElement(x2).click(x2).perform();
  }

 
}
 


