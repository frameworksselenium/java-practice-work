package annotations.annotationsWithTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class TestCases {

    @MetaData(TestCaseID = 101, TestCaseName = "Login Hotel Application", TestCaseDescription = "Log and validate home page")
    @Test
    public void Login(Method method) {
       MetaData aTestDataInfo = (MetaData)method.getAnnotation(MetaData.class);
       String testCaseName = aTestDataInfo.TestCaseName();
       System.out.println(aTestDataInfo);
       System.out.println(testCaseName);
   }

}