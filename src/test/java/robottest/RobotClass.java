package robottest;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class RobotClass {

    @Test
    public static void  execution() throws InterruptedException, AWTException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url
        Robot robot = new Robot();
        robot.delay(1500);

        //to enter user name
        StringSelection username = new StringSelection("Krishna");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //press tab
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(1500);

        //to enter user password
        StringSelection password = new StringSelection("India@123");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(password, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //press tab
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        //enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1500);


        //this code is for right click and one key down and enter
        robot.mouseMove(630, 420); // move mouse point to specific location
        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click
        robot.delay(1500);
        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        // press enter key of keyboard to perform above selected action
    }
}
