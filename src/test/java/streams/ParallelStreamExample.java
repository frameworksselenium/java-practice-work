package streams;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class ParallelStreamExample {

    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        ArrayList<String> links = new ArrayList<>();
        System.out.println("no of links :" + elements.size());
        for(WebElement ele:elements){
            String attribValue = ele.getAttribute("href");
            links.add(attribValue);
            //findBrokenLinks(attribValue);
        }
        long starttime = System.currentTimeMillis();
        links.parallelStream().forEach(e->findBrokenLinks(e));
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time taken to execute scrips :" + (endTime - starttime));
    }

    public static void findBrokenLinks(String url){
        int respCode = 200;
        try {
            HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
            huc.setRequestMethod("HEAD");
            huc.connect();
            respCode = huc.getResponseCode();
            if(respCode >= 400){
                System.out.println(Thread.currentThread().getId() + ":::::" + url+" is a broken link");
            }
            else{
                System.out.println(Thread.currentThread().getId() + ":::::" + url+" is a valid link");
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
