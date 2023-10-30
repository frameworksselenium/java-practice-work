package streams.practice.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersOnConditionExamples3 {

    public static void main(String [] args){
        List<String> names = Arrays.asList("Jan", "Feb", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        List<String> longnames = new ArrayList<String>();

        //Apply multiple conditions and collect to other list and print
        longnames = names.stream().filter((s)->s.length()>4 && s.length()<9).collect(Collectors.toList());
        System.out.println("Collect and store to another List and print " + longnames);

        //Apply multiple conditions and print
        names.stream().filter((s)->s.length()>4 && s.length()<9).forEach((s)->System.out.println("Apply multiple conditions and and print : " + s));

        //Apply multiple conditions and print
        names.stream().filter((s)->s.length()>4 && s.length()<9).forEach(System.out::println);
    }
}
