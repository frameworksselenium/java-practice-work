package streams.practice.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapNullValuesExamples2 {

    public static void main(String [] args){

        List<String> names = Arrays.asList("Jan", "Feb", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        List<Integer> upperCaseName = new ArrayList<Integer>();

        //get length for all elements and collect to other list and print
        upperCaseName = names.stream().map((s)->s.length()).collect(Collectors.toList());
        System.out.println("Collect and store to another List after conver to upper and print " + upperCaseName);

        //Apply multiple conditions and and print
        names.stream().map((s)->s.length()).forEach((s)->System.out.println("length og string : " + s));

        //Apply multiple conditions and and print
        names.stream().map((s)->s.length()).forEach(System.out::println);
    }
}
