package TrakZues_data;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TrakZues_Base.base;

public class loginpage extends base {

	/*
	 * @FindBy(name = "username") WebElement username;
	 * 
	 * //WebElement password = (WebElement) By.name("password");
	 * 
	 * @FindBy(name ="password") WebElement password;
	 * 
	 * //WebElement accept = (WebElement) By.name("checkedG");
	 * 
	 * @FindBy(name = "checkedG") WebElement accept;
	 * 
	 * //WebElement verify = (WebElement) By.name("recaptcha-checkbox-border");
	 * 
	 * @FindBy(name = "recaptcha-checkbox-border") WebElement verify;
	 * 
	 * //WebElement login = (WebElement) By.xpath("//p[.='Log In']");
	 * 
	 * @FindBy(xpath = "//p[.='Log In']") WebElement login_button;
	 */

	public loginpage(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By checkbox = By.xpath("//input[@name='policyCheckbox']");
	// By verify = By.name("recaptcha-checkbox-border");
	// By loginbutton = By.xpath("//p[.='Log In']");
	// By loginbutton = By.xpath("//span[contains(.,'LOGIN')]");
	By loginbutton = By.xpath("//button[@type='submit']");
	By account = By.xpath("//button[@title='Account']");
	By logout = By.xpath("//button[contains(.,'Logout')]");
	By dashboard = By.xpath("(//span[contains(text(),'Dashboard')])[1]");
	By tracking = By.xpath("(//h6[contains(text(),'Tracking: ')])[1]");
	By running = By.xpath("//span[contains(text(),'RUNNING')]");
	By idle = By.xpath("//span[contains(text(),'IDLE')]");
	By halt = By.xpath("//span[contains(text(),'HALT')]");
	By nogps = By.xpath("//span[contains(text(),'NO GPS')]");
	By nontracking = By.xpath("//h6[contains(text(),'Non Tracking')]");
	By offline = By.xpath("//span[contains(text(),'OFFLINE')]");
	By nodata = By.xpath("//span[contains(text(),'NO DATA')]");
	By dead = By.xpath("//span[contains(text(),'DEAD')]");
	By currenttracking = By.xpath("//span[contains(text(),'Current Trackinfo')]");
	By currentsummary = By.xpath("//span[contains(text(),'Current Summary')]");
	By vehicle = By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[1]");
	By vehiclenumber = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-adornedStart MuiOutlinedInput-adornedStart']");
	By travelreplay = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit MuiTab-labelIcon MuiTab-fullWidth']");
	By fromdate = By.xpath("(//div[@format='MMMM Do hh:mm a'])[1]");
	By from = By.xpath("//p[normalize-space()='12']");
	By fromok = By.xpath("//span[normalize-space()='OK']");
	By dateok = By.xpath("//input[@value='May 13th 12:00 am']");
	By todate = By.xpath("//input[@value='May 13th 12:00 am']");
	By todateok = By.xpath("//span[normalize-space()='OK']");
	By startreplay = By.xpath("//span[normalize-space()='START REPLAY']");
	By startreplayframe = By
			.cssSelector(".MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-1.MuiGrid-justify-xs-space-around");

	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}

	/*
	 * public WebElement verify() { return driver.findElement(verify); }
	 */
	public WebElement loginbutton() {
		return driver.findElement(loginbutton);
	}

	public WebElement account() {
		return driver.findElement(account);
	}

	public WebElement logout() {
		return driver.findElement(logout);
	}

	public WebElement dashboard() {
		System.out.println(driver.findElement(dashboard).getText());
		return driver.findElement(dashboard);
	}

	public WebElement tracking() {
		System.out.println(driver.findElement(tracking).getText());
		return driver.findElement(tracking);
	}

	public WebElement running() {
		System.out.println(driver.findElement(running).getText());
		return driver.findElement(running);
	}

	public WebElement idle() {
		System.out.println(driver.findElement(idle).getText());
		return driver.findElement(idle);
	}

	public WebElement halt() {
		System.out.println(driver.findElement(halt).getText());
		return driver.findElement(halt);
	}

	public WebElement nogps() {
		System.out.println(driver.findElement(nogps).getText());
		return driver.findElement(nogps);
	}

	public WebElement nontracking() {
		System.out.println(driver.findElement(nontracking).getText());
		return driver.findElement(nontracking);
	}

	public WebElement offline() {
		System.out.println(driver.findElement(offline).getText());
		return driver.findElement(offline);
	}

	public WebElement nodata() {
		System.out.println(driver.findElement(nodata).getText());
		return driver.findElement(nodata);
	}

	public WebElement dead() {
		System.out.println(driver.findElement(dead).getText());
		return driver.findElement(dead);
	}

	public WebElement currenttracking() {
		System.out.println(driver.findElement(currenttracking).getText());
		return driver.findElement(currenttracking);
	}

	public WebElement currentsummary() {
		System.out.println(driver.findElement(currentsummary).getText());
		return driver.findElement(currentsummary);
	}

	public WebElement vehicle() {
		System.out.println(driver.findElement(vehicle).getText());
		return driver.findElement(vehicle);
	}
	
	public WebElement vehiclenumber() {
		driver.findElement(vehiclenumber).sendKeys("0000");
		System.out.println(driver.findElement(vehiclenumber).getText());
		return driver.findElement(vehiclenumber);
	}

	public WebElement travelreplay() {
		System.out.println(driver.findElement(travelreplay).getText());
		return driver.findElement(travelreplay);
	}

	public WebElement fromdate() {
		System.out.println(driver.findElement(fromdate).getText());
		return driver.findElement(fromdate);
	}

	public WebElement from() {
		System.out.println(driver.findElement(from).getText());
		return driver.findElement(from);
	}

	public WebElement fromok() {
		System.out.println(driver.findElement(fromok).getText());
		return driver.findElement(fromok);
	}

	public WebElement dateok() {
		System.out.println(driver.findElement(dateok).getText());
		return driver.findElement(dateok);
	}

	public WebElement todate() {
		System.out.println(driver.findElement(todate).getText());
		return driver.findElement(todate);
	}

	public WebElement todateok() {
		System.out.println(driver.findElement(todateok).getText());
		return driver.findElement(todateok);
	}

	public WebElement startreplay() {
		System.out.println(driver.findElement(startreplay).getText());
		return driver.findElement(startreplay);
	}

	public WebElement startreplayframe() {
		System.out.println(driver.findElement(startreplayframe).getText());
		return driver.findElement(startreplayframe);
	}

	public String[][] trackinginfotable() {

		// By name = By.xpath("//td[normalize-space()='AT_3333333']");
		By tablehead = By.xpath("//thead");
		By tableheadcontent = By.cssSelector(".jss182.jss185");
		By tablecontents = By.xpath("//tbody");
		By tablecontentstext = By.cssSelector("tr[id='MUIDataTableBodyRow-6'] td:nth-child(2)");

		// printing table head

		System.out.println(driver.findElement(tablehead).getText());
		List<WebElement> hcolums = driver.findElements(tableheadcontent);
		int hcolumncount = hcolums.size();
		System.out.println("Number of columns in table are " + hcolumncount);

		List<WebElement> hrows = driver.findElements(tableheadcontent);
		int hrowscount = hrows.size();
		System.out.println("Number of rows in table are " + hrowscount);

		// printing table contents
		System.out.println(driver.findElement(tablecontents).getText());
		List<WebElement> columns = driver.findElements(tablecontentstext);
		int columncount = columns.size();
		System.out.println("Number of columns in table are " + columncount);

		List<WebElement> rows = driver.findElements(tablecontentstext);
		int rowscount = rows.size();
		System.out.println("Number of rows in table are " + rowscount);

		return null;
	}

	public String[][] summarytable() {

		// By name = By.xpath("//td[normalize-space()='AT_3333333']");
		By tablehead = By.xpath("//thead");
		By tableheadcontent = By.cssSelector(".jss182.jss185");
		By tablecontents = By.xpath("//tbody");
		By tablecontentstext = By.cssSelector(".MuiTableBody-root");
		

		// printing table head

		System.out.println(driver.findElement(tablehead).getText());
		List<WebElement> hcolums = driver.findElements(tableheadcontent);
		int hcolumncount = hcolums.size();
		System.out.println("Number of columns in table are " + hcolumncount);

		List<WebElement> hrows = driver.findElements(tableheadcontent);
		int hrowscount = hrows.size();
		System.out.println("Number of rows in table are " + hrowscount);

		// printing table contents
		System.out.println(driver.findElement(tablecontents).getText());
		List<WebElement> columns = driver.findElements(tablecontentstext);
		int columncount = columns.size();
		System.out.println("Number of columns in table are " + columncount);

		List<WebElement> rows = driver.findElements(tablecontentstext);
		int rowscount = rows.size();
		System.out.println("Number of rows in table are " + rowscount);

		return null;
	}
	
	//By selfromdate = By.xpath("//div[@class='MuiPickersBasePicker-container']");
	
	public WebElement selfromdate() {
		
		//WebElement frommonth = driver.findElement(selfromdate);
		
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[1]")).click();
		List<WebElement> year = driver.findElements(By.xpath("//div[@class='MuiTypography-root MuiPickersYear-root MuiTypography-subtitle1']"));
		for(int i=0;i<year.size();i++)
		{
			if(year.get(i).getText().equals("2022"))
			{
				String month = null;
				if(month.equals("May"))
				{
					List<WebElement> date1 = driver.findElements(By.xpath("//div[@role='presentation']"));
					for(int j=0;j<date1.size();j++)
					{
						if(date1.get(j).getText().equals("10"))
						{
							driver.findElement(By.xpath("//span[normalize-space()='OK']"));
						}
					}
				}
			}
		}
		
		return null;
		
	}

}
