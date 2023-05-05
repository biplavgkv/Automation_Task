package Test_method;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_base.BrowserPage;

public class Homepage_Element extends BrowserPage
{
	@FindBy(xpath="//span[@class='c-13l9cls']")
	WebElement click;
	@FindBy(xpath="//div[@class='headerPrimary__logoWrapper undefined']")
	WebElement logo;
	@FindBy(xpath="//div[text()='Additional 10% off on stays']")
	WebElement BecomeMember;
	@FindBy(xpath="//span[text()='OYO for Business']")
	WebElement Oyo4 ;
	@FindBy(xpath="//div[text()='Start earning in 30 mins']")
	WebElement ListProperty;
	@FindBy(xpath="//div[text()='Call us to Book now']")
	WebElement call;

	@FindBy(xpath="//h2[text()='Bangalore']")
	WebElement BLR;

	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][1]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListBLR;
	public List<WebElement>CitiesBlr()
	{
		return cityListBLR;

	}

	@FindBy(xpath="//h2[text()='Chennai']")
	WebElement CHN;
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][2]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListCHN;
	public List<WebElement>CitiesCHN()
	{
		return cityListCHN;

	}
	@FindBy(xpath="//h2[text()='Delhi']")
	WebElement DLH;
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][3]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListDLH;
	public List<WebElement>CitiesDLH()
	{
		return cityListDLH;

	}
	@FindBy(xpath="//h2[text()='Gurgaon']")
	WebElement GRG;
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][4]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListGRG;
	public List<WebElement>CitiesGRN()
	{
		return cityListGRG;

	}
	@FindBy(xpath="//h2[text()='Hyderabad']")
	WebElement HYB;
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][5]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListHYB;
	public List<WebElement>CitiesHYB()
	{
		return cityListHYB;

	}

	@FindBy(xpath="//h2[text()='Kolkata']")
	WebElement KOL;
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][6]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListKOL;
	public List<WebElement>CitiesKOL()
	{
		return cityListKOL;

	}

	@FindBy(xpath="//h2[text()='Mumbai']")
	WebElement MUM;
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][7]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListMUM;
	public List<WebElement>CitiesMUM()
	{
		return cityListMUM;

	}

	@FindBy(xpath="//h2[text()='Noida']")
	WebElement NOD;
	
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][8]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListNOD;
	public List<WebElement>CitiesNOD()
	{
		return cityListNOD;

	}

	@FindBy(xpath="//h2[text()='Pune']")
	WebElement PUN;
	
	@FindBy(xpath="//div[@class='mddCityItem__cityItemWrapper'][9]//div[@class='mddCityPopUp d-popup']/a")
	List<WebElement> cityListPUN;
	public List<WebElement>CitiesPUN()
	{
		return cityListPUN;

	}
	@FindBy(xpath="//input[@id='autoComplete__home']")
	WebElement SearchBox;
	@FindBy(xpath="//div[@class='d-popup geoSuggestionsList']/div/div[2]")
	WebElement city;
	@FindBy(xpath="//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop__checkInOut u-textEllipsis']")
	WebElement clickCalen;
	@FindBy(xpath="//div[@class='DateRangePicker__Month'][2]")
	WebElement Calen;
	@FindBy(xpath="//div[@class='DateRangePicker__Month'][2]//span[text()='4'][1]")
	WebElement date;
	@FindBy(xpath="//div[@class='DateRangePicker__Month'][2]//span[text()='11'][1]")
	WebElement date2;
	@FindBy(xpath="//div[@class='oyo-cell oyo-cell--3-col oyo-cell--4-col-tablet oyo-cell--4-col-phone homeSearchWidget__gutter homeSearchWidget__guestRoomPicker']/div/div")
	WebElement selectNoRoom;
	@FindBy(xpath="//span[@class='guestRoomPickerPopUp__plus']")
	WebElement incRoom;
	@FindBy(xpath="//span[@class='guestRoomPickerPopUp__minus']")
	WebElement decRoom;
	@FindBy(xpath="//button[text()='Add Room']")
	WebElement ADDroom;
	@FindBy(xpath="//button[text()='Delete Room']")
	WebElement DELroom;
	@FindBy(xpath="//button[text()='Search']")
	WebElement searchbtn;
    @FindBy(xpath="//input[@name='test']")
    WebElement mapview;
    @FindBy(xpath="//div[@class='autocomplete__wrapper undefined']")
    WebElement searchboxIn;
    @FindBy(xpath="//div[text()='Bistupur Gurudwara']")
    WebElement Bist;
    @FindBy(xpath="//div[@class='dropdown']//span[text()='Guest Ratings']")
	WebElement sortby;
	//constructor
	public Homepage_Element()
	{
		PageFactory.initElements(driver,this);
	}
	//Methods
	public WebElement clicked()
	{
		return click;
	}


	public WebElement Logo()
	{
		return logo;
	}

	public WebElement BecomeMember()
	{
		return BecomeMember;
	}
	public WebElement OyoMember()
	{
		return Oyo4;
	}
	public WebElement ListProperty()
	{
		return ListProperty ;
	}
	public WebElement CallUs()
	{
		return call;
	}
	public WebElement bang()
	{
		return BLR;
	}
	public WebElement chen()
	{
		return CHN;
	}
	public WebElement del()
	{
		return DLH;
	}
	public WebElement gur()
	{
		return GRG;
	}
	public WebElement Hyb()
	{
		return HYB;
	}
	public WebElement KOL()
	{
		return KOL;
	}
	public WebElement MUM()
	{
		return MUM;
	}
	public WebElement NOD()
	{
		return NOD;
	}
	public WebElement PUN()
	{
		return PUN ;
	}
	public WebElement Searchbox()
	{
		return SearchBox;
	}
	public WebElement selectPlace()
	{
		return city;
	}
	public WebElement clickCalenn()
	{
		return clickCalen;
	}
	public WebElement DatePicker()
	{
		return Calen;
	}
	public WebElement date()
	{
		return date;
	}
	public WebElement date2()
	{
		return date2;
	}
	public WebElement roomSelect()
	{
		return selectNoRoom;
	}
	public WebElement Inc()
	{
		return incRoom ;
	}
	public WebElement dec()
	{
		return decRoom;
	}
	public WebElement addroom()
	{
		return ADDroom ;
	}
	public WebElement delroom()
	{
		return DELroom ;
	}
	public WebElement searchButton()
	{
		return searchbtn;
	}
	public WebElement MapView()
	{
		return mapview;
	}
	public WebElement SearchboxIn()
	{
		return searchboxIn ;
	}
	public WebElement bistupur()
	{
		return Bist;
	}
    public WebElement SortBy()
    {
    	return sortby;
    }
	
}
