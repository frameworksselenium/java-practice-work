package streams.practice.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersExamples1 {

    public static void main(String [] args){
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers = new ArrayList<Integer>();

        //collect to other list and print
        evenNumbers = values.stream().filter((n)->n%2==0).collect(Collectors.toList());
        System.out.println("Collect and store to another List and print " + evenNumbers);

        //collect and print
        values.stream().filter((n)->n%2==0).forEach((n)->System.out.println("Collect and print : " + n));

        //or method reference
        values.stream().filter((n)->n%2==0).forEach(System.out::println);
    }
}
