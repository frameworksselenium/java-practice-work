package patterns.facadePatternExamples;


import org.openqa.selenium.WebDriver;

public class Test {

    public static void main(String[] args) {
        WebDriver driver = DriverFacade.getDriver("Local","Chrome");
        ManagerDriver.getInstance().setWebDriver(driver);
        WebDriver driver1 = ManagerDriver.getInstance().getWebDriver();
    }

}
