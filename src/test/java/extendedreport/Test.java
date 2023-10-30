package extendedreport;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class Test {

    @BeforeSuite()
    public void setup(){
        ExtentLog extLog = ExtentManager.init("C:\\Automation\\WorkSpace\\java-practice-work\\target\\Reports\\Reports.html");
    }

    @org.testng.annotations.Test()
    public void LogTest1(){
        try{
            ExtentManager.init().createTest("TestCase01");
            ExtentManager.init().loginternal("Pass","Test1 Passed");
        }catch(Exception e){
            throw new Exceptions(e);
        }
    }

    @org.testng.annotations.Test()
    public void LogTest2(){
        try{
            ExtentManager.init().createTest("TestCase01");
            ExtentManager.init().loginternal("FAIL","Test2 Passed");
        }catch(Exception e){
            throw new Exceptions(e);
        }
    }

    @org.testng.annotations.Test()
    public void LogTest3(){
        try{
            ExtentManager.init().createTest("TestCase01");
            ExtentManager.init().loginternal("Pass","Test3 Passed");
            ExtentManager.init().createNode("jsonrequest","dfsfsdfsdfsdfsdfsdf");

        }catch(Exception e){
            throw new Exceptions(e);
        }
    }
   @AfterSuite()
    public void close(){
       ExtentManager.init().endExtentTest();
    }

}
