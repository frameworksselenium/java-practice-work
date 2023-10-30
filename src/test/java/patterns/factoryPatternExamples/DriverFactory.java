package patterns.factoryPatternExamples;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver getDriver(String executionType, String browser, String executionMode){
        if("Local".equalsIgnoreCase(executionMode)) {
            return LocalDriver.getInstance().createNewDriver(executionType, browser);
        }else if("Remote".equalsIgnoreCase(executionMode)) {
            return RemoteDriver.getInstance().createNewDriver(executionType, browser);
        }
        return null;
    }

}
