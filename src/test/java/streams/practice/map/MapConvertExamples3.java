package streams.practice.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapConvertExamples3 {

    public static void main(String [] args){
        List<String> names = Arrays.asList("Jan", "Feb", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        List<String> upperCaseName = new ArrayList<String>();

        //Apply multiple conditions and collect to other list and print
        upperCaseName = names.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Collect and store to another List after conver to upper and print " + upperCaseName);

        //Apply multiple conditions and and print
        names.stream().map((s)->s.toUpperCase()).forEach((s)->System.out.println("Apply to Upper Case and and print : " + s));

        //Apply multiple conditions and and print
        names.stream().map((s)->s.toUpperCase()).forEach(System.out::println);
    }
}
