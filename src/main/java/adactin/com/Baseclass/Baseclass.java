
package adactin.com.Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
public static WebDriver driver;
	
	public static void browserLaunch(String browser) {
		
	if (browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}else if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void getUrl(String url) {
driver.get(url);
	}
	
	public static void Window_max() {
driver.manage().window().maximize();
	}
	
	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed=false;
		try {
			displayed=element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not dispalyed:"+e.getMessage());
		}
return displayed;
	}
	
	public static void elementSendKeys(WebElement element,String value) {
		try {
			elementClear(element);
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Unable to Pass the value :"+e.getMessage());
		}

	}
	
	public static void elementClear(WebElement element) {
try {
	element.clear();
} catch (Exception e) {
	// TODO: handle exception
}
	}
	
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to click:"+e.getMessage());
		}

	}
	
	public static String getText(WebElement element) {
		String text=null;
		try {
			text=element.getText();
		} catch (Exception e) {
			System.out.println("unable to fetch the text :"+e.getMessage());
		}
return text;
	}
	
	
}
