package brokenLinks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {


    public static void main(String[] args) throws IOException {

        //System.setProperty("webdriver.chrome.driver","C:\\Automation\\drivers\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int brokenLinksCount = 0;
        try {
            for (WebElement link : links) {
                String url = link.getAttribute("href");
                if (url == null || url.isEmpty()) {
                    System.out.println("url Empty : " + url);
                    continue;
                } else {
                    URL linkURl = new URL(url);
                    HttpURLConnection httpConnection = (HttpURLConnection) linkURl.openConnection();
                    httpConnection.connect();
                    if (httpConnection.getResponseCode() >= 400) {
                        System.out.println("Response Code : '" + httpConnection.getResponseCode() + "' and broken url is '" + url + "'");
                        brokenLinksCount++;
                    }else{
                        System.out.println("Response Code : '" + httpConnection.getResponseCode() + "' and valid url is '" + url + "'");
                    }
                }
            }
        }catch(Exception ex){

        }
        System.out.println("No of Links Broken : '" + brokenLinksCount);

    }
}
