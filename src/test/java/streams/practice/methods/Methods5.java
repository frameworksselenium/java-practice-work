package streams.practice.methods;

import java.util.*;
import java.util.stream.Collectors;

public class Methods5 {

    public static void main(String [] args){

        Set<String> fruits = new HashSet<>();
        fruits.add("One Mango");
        fruits.add("One Apple");
        fruits.add("Two Bananas");
        fruits.add("More Grapes");

        //AnyMatch any value should match with One then it will return true or false
        boolean results = fruits.stream().anyMatch((s)->{return s.startsWith("One");});
        System.out.println("Any Match : " + results);

        //AllMatch all value should match with One then it will return true or false
        boolean results1 = fruits.stream().allMatch((s)->{return s.startsWith("One");});
        System.out.println("All Match : " + results1);

        //NonMatch non of the values should match with One the return true or false
        boolean results2 = fruits.stream().allMatch((s)->{return s.startsWith("One");});
        System.out.println("Non Match : " + results2);


        //FindAny
        Optional<String> findAny = fruits.stream().findAny();
        System.out.println("findAny : " + findAny.get());

        //FindFirst
        Optional<String> FindFirst = fruits.stream().findFirst();
        System.out.println("findFirst : " + FindFirst.get());
    }
}
