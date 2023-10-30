package patterns.factoryPatternExamples;


import org.openqa.selenium.WebDriver;

public class Test {

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getDriver("Head","Chrome","Local");
        ManagerDriver.getInstance().setWebDriver(driver);

        WebDriver driver1 = ManagerDriver.getInstance().getWebDriver();

    }

}
