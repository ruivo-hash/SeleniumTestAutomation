package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverUtil {

	protected static WebDriver driver;
	
	public static void InitializeChromeDriver() {
		driver = new ChromeDriver();
	}
}
