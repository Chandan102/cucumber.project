package TrakZues_Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;

	public Properties prop;

	public WebDriver initializedriver() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"./src/main/java/TrakZues_Base/data_properties");

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"./TrakZues/drivers/chromedriver/chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		//driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

}
