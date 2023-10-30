package lambdas.consumerExamples;

import java.util.function.Consumer;

public class ConsumerExamples2 {

    public static void main(String[] args) {
        // consumer chaning

        Consumer<String> c1 = (s)->System.out.println(s + " is White in Color");

        Consumer<String> c2 = (s)->System.out.println(s + " is having 4 legs");
        Consumer<String> c3 = (s)->System.out.println(s + " is eats grass");

        c1.accept("Cow");
        c2.accept("Cow");
        c3.accept("Cow");
        //or
        c1.andThen(c2).andThen(c3);
        // or
        Consumer<String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Cow");
    }

}
