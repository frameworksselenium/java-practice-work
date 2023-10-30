package patterns.factoryPatternExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.Collections;

public class LocalDriver {

	private static org.apache.log4j.Logger loggers;
	private static LocalDriver instance = new LocalDriver();

	public static LocalDriver getInstance() {
		return instance;
	}

	public WebDriver createNewDriver(String executionType, String browser) {
		WebDriver driver = null;
		File directory = new File(".");
		String driverPath = System.getProperty("user,dir") + "\\src\\test\\resources\\drivers";
		DesiredCapabilities cap = null;
		if (executionType.toUpperCase().equalsIgnoreCase("HEADLESS")) {
			if (browser.toUpperCase().contains("CH")) {
				//cap = DesiredCapabilities.chrome();
			}
			if (browser.toUpperCase().contains("FF")) {
				//cap = DesiredCapabilities.firefox();
			}
			if (browser.toUpperCase().contains("IE")) {
				//cap = DesiredCapabilities.internetExplorer();
			}
		}
		if (executionType.toUpperCase().equalsIgnoreCase("HEAD")) {
			if (browser.toUpperCase().contains("CH")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("no-sandbox");
				options.addArguments("start-maximized");
				options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				driver = new ChromeDriver(options);
			}
			if (browser.toUpperCase().contains("FF")) {
				driver = new FirefoxDriver();
			}
			if (browser.toUpperCase().contains("IE")) {
				System.setProperty("webdriver.ie.driver", driverPath + "\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}
		return driver;
	}
}
