package extendedreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Supplier;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ExtentLog {

	private final ExtentHtmlReporter _reporter;
	private final ExtentReports _report;
	static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
	private volatile ExtentTest _test;
	private Path _fileRoot;
	private String _scrrenshotThreshold = "FAIL";
	private Path _captureLocation;
	private Supplier<String> _fileNameGenerator;
	
	public ExtentLog(String fileName) {

		this(fileName, "./capture/");
	}

	public ExtentLog(String fileName, String captureLocation) {
		this(fileName, captureLocation, ExtentLog::filenameGenerator);
	}

	public ExtentLog(String fileName, String captureLocation, Supplier<String> filenameGenerator) {
		if (fileName == null) {
			throw new Exceptions("filename cannot be null");
		}
		if (captureLocation == null) {
			throw new Exceptions("captureLocation cannot be null");
		}
		if (filenameGenerator == null) {
			throw new Exceptions("filenameGenerator cannot be null");
		}
		_fileRoot = Paths.get(new File(fileName).getParent());
		_reporter = new ExtentHtmlReporter(fileName);
		_report = new ExtentReports();
		_report.attachReporter(_reporter);
		_captureLocation = _fileRoot.resolve(Paths.get(captureLocation));
		_fileNameGenerator = filenameGenerator;
	}


	public void loginternal(String status, String message) {
		if(getTest()==null){
			throw new Exceptions("no test started");
		}
		if(_scrrenshotThreshold.contains("FAIL")){
			logwithscreenshot(status, message);
		}else{
			logSimple(status, message);
		}
	}

	private static String filenameGenerator() {
		return Long.toString(System.currentTimeMillis());
	}

	public ExtentLog asAppending() {
		_reporter .setAppendExisting(true);
		return this;
	}
	
	public synchronized ExtentLog createTest(String testName) {
		_test = _report.createTest(testName);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), _test);
		return this;
	}

	public synchronized ExtentLog createTest(String testName, String description) {
		_test = _report.createTest(testName, description);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), _test);
		return this;
	}
	
	private static synchronized ExtentTest getTest(){
		return extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	}

	private synchronized void logSimple(String status, String message){
			getTest().info(message);
	}

	private synchronized void logwithscreenshot(String status, String message){
		MediaEntityModelProvider provider=null;
		WebDriver driver=null;
		try{
			if(driver==null){
				logSimple(status, message);
				return;
			}
			@SuppressWarnings("unused")
			Path file=buildFilePath();
			TakesScreenshot _screenCapture=(TakesScreenshot) driver;
			//FileUtils.copyFile(_screenCapture.getScreenshotAs(org.openqa.selenium.OutputType.FILE), file.toFile());
			//provider= MediaEntityBuilder.createScreenCaptureFromPath(_fileRoot.relativize(file).toString()).build();
		//}catch(IOException e){
			//throw new Exceptions(e.getMessage());
		}catch(WebDriverException ex){
			provider=null;
		}
		getTest().info(message, provider);
	}

	private Path buildFilePath(){
		return Paths.get(String.format("%s/%s.png",_captureLocation, _fileNameGenerator.get()));
	}

	public ExtentLog captureScreenshots(String statusThreshold){
		_scrrenshotThreshold=statusThreshold;
		return this;
	}

	public synchronized void createNode(String title, String message){
		getTest().createNode(title).info(message);
	}
	public ExtentLog endExtentTest(){
		_report.flush();
		return this;
	}
}
