package patterns.singletonStaticblockInitialization.testng.nativedependencyinjection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class TestCases {
    WebDriver driver= null;
    @BeforeMethod
    public void beforemethod(ITestContext testContext, java.lang.reflect.Method m, XmlTest xmltest){

    }
    @Test
    public void Login(ITestContext testContext) {

        String driverPath = "C:\\Automation\\drivers";
        System.setProperty("webdriver.chrome.driver", driverPath + "C:\\Automation\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("no-sandbox");
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
        
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        driver.findElement(By.id("")).click();
    }

    @AfterMethod
    public void aftermethod(ITestResult itestresult, java.lang.reflect.Method m, XmlTest xmltest){

    }

    @Test (dataProvider = "data-provider")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"First-Value"}, {"Second-Value"}};
    }



}