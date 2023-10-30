package annotations.annotationsWithTestNG;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MetaData {
    int TestCaseID()default 1;  ;
    String TestCaseName()default "MyTestCase";
    String TestCaseDescription()default "Test Case Functionality";

}