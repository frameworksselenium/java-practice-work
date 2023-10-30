
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v107.network.Network;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class Sel {
    static String nmae = "Krishna";
    String age = "29";
    public static void main(String [] args) throws ParseException {


        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        Date d = c.getTime();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
        String format = formatter.format(d);
        System.out.println(format);

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        DevTools devTools = driver.getDevTools();

        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(),Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(),
                request->{
                    System.out.println("Response Code : " + request.getRequest().getHasPostData() + "Response URL : " + request.getRequest().getUrl());
                });

        driver.get("https://www.google.com/");


        System.out.println(nmae);
        driver.quit();
    }

}
