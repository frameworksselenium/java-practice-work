package streams;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
public class ParallelStreamExample1 {

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
        ForkJoinPool fjp1 = new ForkJoinPool(4);
        Runnable callable1 = () -> links.parallelStream().forEach(number -> findBrokenLinks(number));
//https://java2blog.com/java-8-parallel-stream/#:~:text=In%20case%20of%20Parallel%20stream,to%20create%20and%20manage%20threads.
        try {
            fjp1.submit(callable1).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time taken to execute scrips :" + (endTime - starttime));
    }

    public static String findBrokenLinks(String url){
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
        return "Completed";
    }
}
