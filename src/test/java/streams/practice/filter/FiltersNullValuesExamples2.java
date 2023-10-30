package streams.practice.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersNullValuesExamples2 {

    public static void main(String [] args){
        List<String> names = Arrays.asList("Jan", "Feb", null, "April", "May", "June", "July", null, "September", null, "November", "December");

        List<String> longnames = new ArrayList<String>();

        //remove null values and collect to other list and print
        longnames = names.stream().filter(s-> s!=null).collect(Collectors.toList());
        System.out.println("Collect and store to another List and print " + longnames);

    }
}
