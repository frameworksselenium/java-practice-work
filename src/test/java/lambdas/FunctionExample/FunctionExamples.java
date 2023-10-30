package lambdas.FunctionExample;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExamples {

    public static void main(String[] args) {

        Function<Integer, Integer> val = (a)->(a*a);
        System.out.println(val.apply(20));
        System.out.println(val.apply(5));


        Function<String, Integer> stringval = s->(s.length());
        System.out.println(stringval.apply("Krishna"));
        System.out.println(stringval.apply("Kris"));

    }

}
