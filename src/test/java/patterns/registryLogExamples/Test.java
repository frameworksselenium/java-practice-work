package patterns.registryLogExamples;

import org.testng.annotations.*;

import java.lang.reflect.Method;

public class Test {

    @BeforeSuite(alwaysRun = true)
    public void init(){

        Logger.getInstance().register(new SystemOutLog());
        Logger.getInstance().register(new Log4JLog());

    }
    @org.testng.annotations.Test()
    public void LogTest(Method method){

        try{
            Logger.getInstance().log("PASS",  "Script Executed");
        }catch(Exception e){
            throw new Exceptions(e);
        }

    }

}