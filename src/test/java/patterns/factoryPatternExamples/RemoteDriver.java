package patterns.factoryPatternExamples;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class RemoteDriver {

	private static RemoteDriver instance = new RemoteDriver();
	public static RemoteDriver getInstance() {
		return instance;
	}

	public WebDriver createNewDriver(String executionType, String browser) {
		System.out.println("It is in createnewdriver:::");
		RemoteWebDriver driver = null;

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
				ChromeOptions options = new ChromeOptions();
				options.addArguments("no-sandbox");
				options.addArguments("start-maximized");
				options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				options.setExperimentalOption("useAutomationExtension", false);
				//cap = DesiredCapabilities.chrome();
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				cap.setBrowserName("chrome");
			}
			if (browser.toUpperCase().contains("FF")) {
				//cap = DesiredCapabilities();
				//cap.setBrowserName("firefox");
				//cap.setPlatform(Platform.WINDOWS);
			}
			if (browser.toUpperCase().contains("IE")) {
				//cap = DesiredCapabilities();
				//cap.setBrowserName("iexplore");
				//cap.setPlatform(Platform.WINDOWS);
			}
			try {
				driver = new RemoteWebDriver(new URL(""), cap);
			} catch (MalformedURLException e) {

				e.printStackTrace();
			}
			}
		return driver;
	}
}
