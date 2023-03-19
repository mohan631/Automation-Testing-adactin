package Baseclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public static WebDriver driver;

	public static void Browserlaunch() {


		System.setProperty("webdriver.edge.driver", "C:\\Users\\sgowt\\OneDrive\\Desktop\\prj\\Adactin\\src\\test\\resources\\driver\\msedgedriver.exe");
		driver=new EdgeDriver();

		/*	
	if (BrowserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgowt\\OneDrive\\Desktop\\prj\\Adactin\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	} else if (BrowserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
		 */
	}
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.err.println("Invalid URL :"+e.getMessage());
		}
	}

	public static boolean elementIsdispalyed(WebElement element) {
		boolean display=false;
		try {
			display=element.isDisplayed();
		} catch (Exception e) {
			System.err.println("Element not displayed : "+e.getMessage());
		}
		return display;
	}

	public static void elementClear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.err.println("Unable to Clear : "+e.getMessage());
		}
	}

	public static void elementSendKeys(WebElement element,String value) {
		try {
			elementClear(element);
			element.sendKeys(value);
		} catch (Exception e) {
			System.err.println("Unable to Enter the value : "+e.getMessage());
		}
	}

	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.err.println("Unable to Click : "+e.getMessage());
		}
	}
	public static byte[] reports_Screenshot() {
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		return screenshot;
	}

	public static Map<String, String> ReadProperty() throws IOException {
		Map<String, String> map = new LinkedHashMap<String, String>();
		FileReader f = new FileReader(".\\src\\test\\resources\\configProperty\\config.properties");
		Properties property = new Properties();
		property.load(f);

		Enumeration<Object> keys = property.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = property.getProperty(key);
			map.put(key, value);
		}
		return map;
	}
}
