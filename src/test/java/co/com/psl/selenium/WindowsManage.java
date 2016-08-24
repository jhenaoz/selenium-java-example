package co.com.psl.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsManage {

	private WebDriver driver;

	public WebDriver getAndOpenWindows(String URL) {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}

	public void Close() {
		driver.close();
	}

}
