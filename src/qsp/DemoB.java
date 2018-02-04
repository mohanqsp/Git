package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoB {
		@Test
			public void testA() throws MalformedURLException {
			
					String path = "./drivers/chromedriver.exe";
					String value = "webdriver.chrome.driver";
					System.setProperty(value, path);
				WebDriver driver = new ChromeDriver();
				
					driver.close();

}
}