package annotations.anntationExamples;

import annotations.anntationExamples.Hello;
import annotations.anntationExamples.IAnnotation;

import java.lang.reflect.Method;

public class Test {

    public static void main(String args[])throws Exception{

        Hello h = new Hello();
        Method m = h.getClass().getMethod("sayHello");
        h.sayHello();
        IAnnotation manno = m.getAnnotation(IAnnotation.class);
        System.out.println("value is: " + manno.value());
    }

}
