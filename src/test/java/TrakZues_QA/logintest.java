package TrakZues_QA;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import TrakZues_Base.base;
import TrakZues_data.loginpage;


public class logintest extends base {

	@BeforeTest
	public void pagenavigation() throws IOException {

		driver = initializedriver();
		//driver.manage().window().maximize();

	}
	@Test
	public void login() throws InterruptedException {

		// driver.get("https://portal.aquilatrack.com/");
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		loginpage l = new loginpage(driver);
		l.username().sendKeys("abhinav");
		l.password().sendKeys("travels");
		l.checkbox().click();
		// l.verify().click();
		l.loginbutton().click();
		Thread.sleep(3000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, null);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * cssSelector("#root > div > div.MuiGrid-root.MuiGrid-container > div > header > div > button:nth-child(5) > span.MuiIconButton-label > svg > path"
		 * )));
		 */
		l.dashboard().click();
		l.tracking().click();
		l.running().click();
		l.idle().click();
		l.halt().click();

		// List<WebElement> vehicle = driver.f

		l.nogps().click();
		l.nontracking().click();
		l.offline().click();
		l.nodata().click();
		l.dead().click();

		driver.navigate().refresh();

		Thread.sleep(4000);

		l.currenttracking().click();
		Thread.sleep(3000);

		l.trackinginfotable();
		driver.navigate().back();
		Thread.sleep(3000);

		l.currentsummary().click();
		Thread.sleep(3000);
		l.summarytable();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		l.vehicle().click();
		l.travelreplay().click();
		/*l.fromdate().click();
		l.from().click();
		l.fromok().click();
		Thread.sleep(2000);
		l.dateok().click();*/
		
		l.selfromdate();
		
		// l.todate().click();
		l.todateok().click();
		Thread.sleep(2000);
		l.startreplay().click();
		Thread.sleep(40000);

		// System.out.println(alert);

		l.account().click();
		l.logout().click();
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
}
