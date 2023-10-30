package streams.practice.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExamples1 {

    public static void main(String [] args){
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> multiplied = new ArrayList<Integer>();

        //collect to other list and print
        multiplied = values.stream().map((n)->n*3).collect(Collectors.toList());
        System.out.println("after multiplied and store to another List and print " + multiplied);

        //collect and print
        values.stream().map((n)->n*3).forEach((n)->System.out.println("Collect and print : " + n));

        //or method reference
        values.stream().map((n)->n*3).forEach(System.out::println);
    }
}
