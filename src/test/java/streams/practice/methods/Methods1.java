package streams.practice.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods1 {

    public static void main(String [] args){

        List<String> list = Arrays.asList("Car", "Bus", "Car", "Van");
        //distinct
        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        list.stream().distinct().forEach((s)->System.out.println(s));
        //Count
        long count = list.stream().distinct().count();
        System.out.println("no of elements : " + count);

        //Limit
        List<String> limit = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(limit);

        list.stream().distinct().limit(2).forEach((s)->System.out.println("Limit : " + s));
    }
}
