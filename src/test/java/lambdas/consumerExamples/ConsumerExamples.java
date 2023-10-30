package lambdas.consumerExamples;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExamples {

    public static void main(String[] args) {

        Consumer<String> c1 = (s)->System.out.println(s);

        c1.accept("Krishna Reddy Manubolu");
    }

}
